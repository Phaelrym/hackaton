/**
 * Copyright : ENIM - France
 * Contributeurs(s) :
 *    Baptiste Mille baptiste.mille@capgemini.com
 * 
 */
package com.hackaton.apiImpl;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.hackaton.Message;
import com.hackaton.MessageApi;
import com.hackaton.Synthesis;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * //TODO à documenter
 * 
 * @author Baptiste Mille baptiste.mille@capgemini.com
 * 
 */
@Path("/")
@Component
public class MessageApiImpl implements MessageApi {

	private int count = 0;
	private static MongoClient mongo;
	static {
		try {
			mongo = new MongoClient("localhost", 27017);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * {@inheritDoc}
	 */

	@Override
	@POST
	@Path("/messages")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response messagesPost(final Message message) {

		DB db = mongo.getDB("hackaton");
		DBCollection table = db.getCollection("message");
		BasicDBObject document = new BasicDBObject();
		document.put("id", message.getId());
		document.put("timestamp", message.getTimestamp());
		document.put("sensorType", message.getSensorType());
		document.put("value", message.getValue());
		table.insert(document);
		count++;
		System.out.println(count);
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@GET
	@Path("/messages/synthesis")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response messagesSynthesisGet() {
		final List<Synthesis> listSynthesis = new ArrayList<Synthesis>();

		DB db = mongo.getDB("hackaton");
		DBCollection table = db.getCollection("message");
		BasicDBObject searchQuery = new BasicDBObject();

		DBCursor cursor = table.find(searchQuery);
			System.out.println(cursor.itcount());

		return Response.status(200).entity(listSynthesis).build();
	}

}
