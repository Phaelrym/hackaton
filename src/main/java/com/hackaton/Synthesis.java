package com.hackaton;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sensorType", "minValue", "maxValue", "mediumValue" })
@XmlRootElement(name = "Synthesis")
public class Synthesis {

    private Integer sensorType = null;

    private Long minValue = null;

    private Long maxValue = null;

    private Long mediumValue = null;

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
     * Valeur minimum transmise par ce type de capteur
     **/

    public Long getMinValue() {
        return minValue;
    }

    public void setMinValue(final Long minValue) {
        this.minValue = minValue;
    }

    /**
     * Valeur maximale transmise par ce capteur type de capteur
     **/

    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(final Long maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Valeur moyenne des donn\u00E9es transmises par ce type de capteur
     **/

    public Long getMediumValue() {
        return mediumValue;
    }

    public void setMediumValue(final Long mediumValue) {
        this.mediumValue = mediumValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class Synthesis {\n");

        sb.append("    sensorType: ").append(toIndentedString(sensorType)).append("\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    mediumValue: ").append(toIndentedString(mediumValue)).append("\n");
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
