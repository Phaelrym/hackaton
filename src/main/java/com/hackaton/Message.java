package com.hackaton;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "timestamp", "sensorType", "value" })
@XmlRootElement(name = "Message")
public class Message {

    private String id = null;

    private javax.xml.datatype.XMLGregorianCalendar timestamp = null;

    private Integer sensorType = null;

    private Long value = null;

    /**
     * Identifiant unique du message envoy\u00E9 par le capteur
     **/

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Horaire de la fabrication du message par le capteur
     **/

    public javax.xml.datatype.XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(final javax.xml.datatype.XMLGregorianCalendar timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Type de capteur \u00E0 l'origine de l'emission du message
     **/

    public Integer getSensorType() {
        return sensorType;
    }

    public void setSensorType(final Integer sensorType) {
        this.sensorType = sensorType;
    }

    /**
     * Valeur transmise par le capteur
     **/

    public Long getValue() {
        return value;
    }

    public void setValue(final Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class Message {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    sensorType: ").append(toIndentedString(sensorType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private static String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
