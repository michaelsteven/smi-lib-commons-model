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
 * The Class NetworkStorageProfile.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkStorageProfile", propOrder = { "serviceTag", "serialNumber", "leadController", "peerController" })
public class NetworkStorageProfile {

    @XmlElement(required = true)
    protected String serviceTag;
    @XmlElement(required = true)
    protected String serialNumber;
    @XmlElement(required = true)
    protected NetworkStorageProfileController leadController;
    @XmlElement(required = true)
    protected NetworkStorageProfileController peerController;


    /**
     * Gets the value of the serviceTag property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getServiceTag() {
        return serviceTag;
    }


    /**
     * Sets the value of the serviceTag property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setServiceTag(String value) {
        this.serviceTag = value;
    }


    /**
     * Gets the value of the serialNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }


    /**
     * Gets the value of the leadController property.
     * 
     * @return possible object is {@link NetworkStorageProfileController }
     * 
     */
    public NetworkStorageProfileController getLeadController() {
        return leadController;
    }


    /**
     * Sets the value of the leadController property.
     * 
     * @param value allowed object is {@link NetworkStorageProfileController }
     * 
     */
    public void setLeadController(NetworkStorageProfileController value) {
        this.leadController = value;
    }


    /**
     * Gets the value of the peerController property.
     * 
     * @return possible object is {@link NetworkStorageProfileController }
     * 
     */
    public NetworkStorageProfileController getPeerController() {
        return peerController;
    }


    /**
     * Sets the value of the peerController property.
     * 
     * @param value allowed object is {@link NetworkStorageProfileController }
     * 
     */
    public void setPeerController(NetworkStorageProfileController value) {
        this.peerController = value;
    }

}
