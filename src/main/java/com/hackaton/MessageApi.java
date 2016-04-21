package com.hackaton;

import javax.ws.rs.core.Response;

public interface MessageApi {

    Response messagesPost(Message message);

    Response messagesSynthesisGet();
}
