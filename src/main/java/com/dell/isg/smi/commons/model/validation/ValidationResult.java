/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.03.04 at 01:18:28 PM CST
//

package com.dell.isg.smi.commons.model.validation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ValidationResult complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValidationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationResult", propOrder = { "valid", "message" })
public class ValidationResult {

    protected boolean valid;
    @XmlElement(required = true)
    protected String message;


    /**
     * Gets the value of the valid property.
     *
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the value of the valid property.
     *
     */
    public void setValid(boolean value) {
        this.valid = value;
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