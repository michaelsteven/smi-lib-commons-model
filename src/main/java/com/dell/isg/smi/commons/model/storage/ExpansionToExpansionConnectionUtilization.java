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
 * <p>
 * Java class for ExpansionToExpansionConnectionUtilization complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpansionToExpansionConnectionUtilization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionHealth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="srouceStorageEnclosure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="srouceStorageEnclosureController" type="{http://esg.dell.com/icee/infrastructure/model/storage}StorageEnclosureController"/>
 *         &lt;element name="srouceStorageEnclosurePort" type="{http://esg.dell.com/icee/infrastructure/model/storage}StorageEnclosurePort"/>
 *         &lt;element name="bandwidthUsed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bandwidthAllocated" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="destinationStorageEnclosure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationStorageEnclosureController" type="{http://esg.dell.com/icee/infrastructure/model/storage}StorageEnclosureController"/>
 *         &lt;element name="destinationStorageEnclosurePort" type="{http://esg.dell.com/icee/infrastructure/model/storage}StorageEnclosurePort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpansionToExpansionConnectionUtilization", propOrder = { "connectionHealth", "srouceStorageEnclosure", "srouceStorageEnclosureController", "srouceStorageEnclosurePort", "bandwidthUsed", "bandwidthAllocated", "destinationStorageEnclosure", "destinationStorageEnclosureController", "destinationStorageEnclosurePort" })
public class ExpansionToExpansionConnectionUtilization {

    protected boolean connectionHealth;
    @XmlElement(required = true)
    protected String srouceStorageEnclosure;
    @XmlElement(required = true)
    protected StorageEnclosureController srouceStorageEnclosureController;
    @XmlElement(required = true)
    protected StorageEnclosurePort srouceStorageEnclosurePort;
    protected long bandwidthUsed;
    protected long bandwidthAllocated;
    @XmlElement(required = true)
    protected String destinationStorageEnclosure;
    @XmlElement(required = true)
    protected StorageEnclosureController destinationStorageEnclosureController;
    @XmlElement(required = true)
    protected StorageEnclosurePort destinationStorageEnclosurePort;


    /**
     * Gets the value of the connectionHealth property.
     * 
     */
    public boolean isConnectionHealth() {
        return connectionHealth;
    }


    /**
     * Sets the value of the connectionHealth property.
     * 
     */
    public void setConnectionHealth(boolean value) {
        this.connectionHealth = value;
    }


    /**
     * Gets the value of the srouceStorageEnclosure property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSrouceStorageEnclosure() {
        return srouceStorageEnclosure;
    }


    /**
     * Sets the value of the srouceStorageEnclosure property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSrouceStorageEnclosure(String value) {
        this.srouceStorageEnclosure = value;
    }


    /**
     * Gets the value of the srouceStorageEnclosureController property.
     * 
     * @return possible object is {@link StorageEnclosureController }
     * 
     */
    public StorageEnclosureController getSrouceStorageEnclosureController() {
        return srouceStorageEnclosureController;
    }


    /**
     * Sets the value of the srouceStorageEnclosureController property.
     * 
     * @param value allowed object is {@link StorageEnclosureController }
     * 
     */
    public void setSrouceStorageEnclosureController(StorageEnclosureController value) {
        this.srouceStorageEnclosureController = value;
    }


    /**
     * Gets the value of the srouceStorageEnclosurePort property.
     * 
     * @return possible object is {@link StorageEnclosurePort }
     * 
     */
    public StorageEnclosurePort getSrouceStorageEnclosurePort() {
        return srouceStorageEnclosurePort;
    }


    /**
     * Sets the value of the srouceStorageEnclosurePort property.
     * 
     * @param value allowed object is {@link StorageEnclosurePort }
     * 
     */
    public void setSrouceStorageEnclosurePort(StorageEnclosurePort value) {
        this.srouceStorageEnclosurePort = value;
    }


    /**
     * Gets the value of the bandwidthUsed property.
     * 
     */
    public long getBandwidthUsed() {
        return bandwidthUsed;
    }


    /**
     * Sets the value of the bandwidthUsed property.
     * 
     */
    public void setBandwidthUsed(long value) {
        this.bandwidthUsed = value;
    }


    /**
     * Gets the value of the bandwidthAllocated property.
     * 
     */
    public long getBandwidthAllocated() {
        return bandwidthAllocated;
    }


    /**
     * Sets the value of the bandwidthAllocated property.
     * 
     */
    public void setBandwidthAllocated(long value) {
        this.bandwidthAllocated = value;
    }


    /**
     * Gets the value of the destinationStorageEnclosure property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDestinationStorageEnclosure() {
        return destinationStorageEnclosure;
    }


    /**
     * Sets the value of the destinationStorageEnclosure property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDestinationStorageEnclosure(String value) {
        this.destinationStorageEnclosure = value;
    }


    /**
     * Gets the value of the destinationStorageEnclosureController property.
     * 
     * @return possible object is {@link StorageEnclosureController }
     * 
     */
    public StorageEnclosureController getDestinationStorageEnclosureController() {
        return destinationStorageEnclosureController;
    }


    /**
     * Sets the value of the destinationStorageEnclosureController property.
     * 
     * @param value allowed object is {@link StorageEnclosureController }
     * 
     */
    public void setDestinationStorageEnclosureController(StorageEnclosureController value) {
        this.destinationStorageEnclosureController = value;
    }


    /**
     * Gets the value of the destinationStorageEnclosurePort property.
     * 
     * @return possible object is {@link StorageEnclosurePort }
     * 
     */
    public StorageEnclosurePort getDestinationStorageEnclosurePort() {
        return destinationStorageEnclosurePort;
    }


    /**
     * Sets the value of the destinationStorageEnclosurePort property.
     * 
     * @param value allowed object is {@link StorageEnclosurePort }
     * 
     */
    public void setDestinationStorageEnclosurePort(StorageEnclosurePort value) {
        this.destinationStorageEnclosurePort = value;
    }

}
