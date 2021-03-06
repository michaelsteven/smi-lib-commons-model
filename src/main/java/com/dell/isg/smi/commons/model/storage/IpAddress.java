/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:06:10 PM CDT 
//

package com.dell.isg.smi.commons.model.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class IpAddress.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpAddress", propOrder = { "ip", "gateway", "subnetMask" })
public class IpAddress {

    @XmlElement(required = true)
    protected String ip;
    @XmlElement(required = true)
    protected String gateway;
    @XmlElement(required = true)
    protected String subnetMask;


    /**
     * Gets the value of the ip property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIp() {
        return ip;
    }


    /**
     * Sets the value of the ip property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIp(String value) {
        this.ip = value;
    }


    /**
     * Gets the value of the gateway property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGateway() {
        return gateway;
    }


    /**
     * Sets the value of the gateway property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setGateway(String value) {
        this.gateway = value;
    }


    /**
     * Gets the value of the subnetMask property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSubnetMask() {
        return subnetMask;
    }


    /**
     * Sets the value of the subnetMask property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSubnetMask(String value) {
        this.subnetMask = value;
    }

}
