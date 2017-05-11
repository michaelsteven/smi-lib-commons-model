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
 * The Class VolumeGrowthOverview.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeGrowthOverview", propOrder = { "activeGrowth", "activeSpace", "actualGrowth", "actualSpace", "configuredSpace", "estimatedFullTime", "lastUpdated", "name", "replayGrowth", "replaySpace" })
public class VolumeGrowthOverview {

    protected long activeGrowth;
    protected long activeSpace;
    protected long actualGrowth;
    protected long actualSpace;
    protected long configuredSpace;
    @XmlElement(required = true)
    protected String estimatedFullTime;
    @XmlElement(required = true)
    protected String lastUpdated;
    @XmlElement(required = true)
    protected String name;
    protected long replayGrowth;
    protected long replaySpace;


    /**
     * Gets the value of the activeGrowth property.
     *
     * @return the active growth
     */
    public long getActiveGrowth() {
        return activeGrowth;
    }


    /**
     * Sets the value of the activeGrowth property.
     *
     * @param value the new active growth
     */
    public void setActiveGrowth(long value) {
        this.activeGrowth = value;
    }


    /**
     * Gets the value of the activeSpace property.
     *
     * @return the active space
     */
    public long getActiveSpace() {
        return activeSpace;
    }


    /**
     * Sets the value of the activeSpace property.
     *
     * @param value the new active space
     */
    public void setActiveSpace(long value) {
        this.activeSpace = value;
    }


    /**
     * Gets the value of the actualGrowth property.
     *
     * @return the actual growth
     */
    public long getActualGrowth() {
        return actualGrowth;
    }


    /**
     * Sets the value of the actualGrowth property.
     *
     * @param value the new actual growth
     */
    public void setActualGrowth(long value) {
        this.actualGrowth = value;
    }


    /**
     * Gets the value of the actualSpace property.
     *
     * @return the actual space
     */
    public long getActualSpace() {
        return actualSpace;
    }


    /**
     * Sets the value of the actualSpace property.
     *
     * @param value the new actual space
     */
    public void setActualSpace(long value) {
        this.actualSpace = value;
    }


    /**
     * Gets the value of the configuredSpace property.
     *
     * @return the configured space
     */
    public long getConfiguredSpace() {
        return configuredSpace;
    }


    /**
     * Sets the value of the configuredSpace property.
     *
     * @param value the new configured space
     */
    public void setConfiguredSpace(long value) {
        this.configuredSpace = value;
    }


    /**
     * Gets the value of the estimatedFullTime property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEstimatedFullTime() {
        return estimatedFullTime;
    }


    /**
     * Sets the value of the estimatedFullTime property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setEstimatedFullTime(String value) {
        this.estimatedFullTime = value;
    }


    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setLastUpdated(String value) {
        this.lastUpdated = value;
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
     * Gets the value of the replayGrowth property.
     *
     * @return the replay growth
     */
    public long getReplayGrowth() {
        return replayGrowth;
    }


    /**
     * Sets the value of the replayGrowth property.
     *
     * @param value the new replay growth
     */
    public void setReplayGrowth(long value) {
        this.replayGrowth = value;
    }


    /**
     * Gets the value of the replaySpace property.
     *
     * @return the replay space
     */
    public long getReplaySpace() {
        return replaySpace;
    }


    /**
     * Sets the value of the replaySpace property.
     *
     * @param value the new replay space
     */
    public void setReplaySpace(long value) {
        this.replaySpace = value;
    }

}
