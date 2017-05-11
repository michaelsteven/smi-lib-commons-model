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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class StorageHealth.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageHealth", propOrder = { "overallHealth", "controllers", "enclosures" })
public class StorageHealth extends HealthBase {

    @XmlElement(required = true)
    protected String overallHealth;
    @XmlElement(required = true)
    protected ControllersHealth controllers;
    @XmlElement(required = true)
    protected List<EnclosureHealth> enclosures;


    /**
     * Gets the value of the overallHealth property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOverallHealth() {
        return overallHealth;
    }


    /**
     * Sets the value of the overallHealth property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOverallHealth(String value) {
        this.overallHealth = value;
    }


    /**
     * Gets the value of the controllers property.
     * 
     * @return possible object is {@link ControllersHealth }
     * 
     */
    public ControllersHealth getControllers() {
        return controllers;
    }


    /**
     * Sets the value of the controllers property.
     * 
     * @param value allowed object is {@link ControllersHealth }
     * 
     */
    public void setControllers(ControllersHealth value) {
        this.controllers = value;
    }


    /**
     * Gets the value of the enclosures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enclosures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEnclosures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link EnclosureHealth }
     *
     * @return the enclosures
     */
    public List<EnclosureHealth> getEnclosures() {
        if (enclosures == null) {
            enclosures = new ArrayList<EnclosureHealth>();
        }
        return this.enclosures;
    }

}
