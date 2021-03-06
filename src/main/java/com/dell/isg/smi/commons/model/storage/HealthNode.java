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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class HealthNode.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthNode", propOrder = { "health" })
@XmlSeeAlso({ ControllerHealth.class, EnclosureHealth.class })
public class HealthNode extends HealthBase {

    @XmlElement(required = true)
    protected String health;


    /**
     * Gets the value of the health property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getHealth() {
        return health;
    }


    /**
     * Sets the value of the health property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setHealth(String value) {
        this.health = value;
    }

}
