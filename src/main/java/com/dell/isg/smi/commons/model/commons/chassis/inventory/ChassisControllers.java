/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.17 at 12:15:24 AM CDT 
//

package com.dell.isg.smi.commons.model.commons.chassis.inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ChassisControllers.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChassisControllers", propOrder = { "id", "name", "location", "firmwareVersion", "hardwareVersion", "midplaneVersion", "lastFirmwareUpdateTime", "controllerStatus" })
public class ChassisControllers {

    /**
     * Instantiates a new chassis controllers.
     */
    public ChassisControllers() {
        super();
    }

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String firmwareVersion;
    @XmlElement(required = true)
    protected String hardwareVersion;
    @XmlElement(required = true)
    protected String midplaneVersion;
    @XmlElement(required = true)
    protected String lastFirmwareUpdateTime;
    @XmlElement(required = true)
    protected ControllerStatus controllerStatus;


    /**
     * Gets the value of the id property.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     *
     * @param value the new id
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * Gets the value of the location property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLocation() {
        return location;
    }


    /**
     * Sets the value of the location property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLocation(String value) {
        this.location = value;
    }


    /**
     * Gets the value of the firmwareVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }


    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }


    /**
     * Gets the value of the hardwareVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHardwareVersion() {
        return hardwareVersion;
    }


    /**
     * Sets the value of the hardwareVersion property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setHardwareVersion(String value) {
        this.hardwareVersion = value;
    }


    /**
     * Gets the value of the midplaneVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMidplaneVersion() {
        return midplaneVersion;
    }


    /**
     * Sets the value of the midplaneVersion property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMidplaneVersion(String value) {
        this.midplaneVersion = value;
    }


    /**
     * Gets the value of the lastFirmwareUpdateTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastFirmwareUpdateTime() {
        return lastFirmwareUpdateTime;
    }


    /**
     * Sets the value of the lastFirmwareUpdateTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastFirmwareUpdateTime(String value) {
        this.lastFirmwareUpdateTime = value;
    }


    /**
     * Gets the value of the controllerStatus property.
     * 
     * @return possible object is {@link ControllerStatus }
     * 
     */
    public ControllerStatus getControllerStatus() {
        return controllerStatus;
    }


    /**
     * Sets the value of the controllerStatus property.
     * 
     * @param value allowed object is {@link ControllerStatus }
     * 
     */
    public void setControllerStatus(ControllerStatus value) {
        this.controllerStatus = value;
    }

}
