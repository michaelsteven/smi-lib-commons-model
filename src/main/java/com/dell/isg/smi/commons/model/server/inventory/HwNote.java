/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.10 at 02:30:44 PM CST 
//

package com.dell.isg.smi.commons.model.server.inventory;

public class HwNote {

    public HwNote() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected long id;

    protected String fqdd;

    protected String message;


    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }


    /**
     * Gets the value of the fqdd property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFqdd() {
        return fqdd;
    }


    /**
     * Sets the value of the fqdd property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFqdd(String value) {
        this.fqdd = value;
    }


    /**
     * Gets the value of the message property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMessage() {
        return message;
    }


    /**
     * Sets the value of the message property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMessage(String value) {
        this.message = value;
    }

}