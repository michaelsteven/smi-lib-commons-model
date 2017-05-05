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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ChassisDetail complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChassisDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisSummary">
 *       &lt;sequence>
 *         &lt;element name="chassisPowerSupply" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisPowerSupply" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chassisIkvm" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisIkvm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chassisControllers" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisControllers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servers" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisServerModel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chassisIoms" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisIomModel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chassisStashStorages" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisStashStorage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chassisFans" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisFan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chassisPcis" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisPci" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="chassisTemperatureSensors" type="{http://esg.dell.com/icee/infrastructure/model/chassis}ChassisTemperatureSensor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChassisDetail", propOrder = { "chassisPowerSupply", "chassisIkvm", "chassisControllers", "servers", "chassisIoms", "chassisStashStorages", "chassisFans", "chassisPcis", "chassisTemperatureSensors" })
public class ChassisDetail extends ChassisSummary {

    public ChassisDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected List<ChassisPowerSupply> chassisPowerSupply;
    protected List<ChassisIkvmModel> chassisIkvm;
    protected List<ChassisControllers> chassisControllers;
    protected List<ChassisServerModel> servers;
    protected List<ChassisIomModel> chassisIoms;
    protected List<ChassisStashStorage> chassisStashStorages;
    protected List<ChassisFan> chassisFans;
    protected List<ChassisPci> chassisPcis;
    protected List<ChassisTemperatureSensor> chassisTemperatureSensors;


    /**
     * Gets the value of the chassisPowerSupply property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassisPowerSupply property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChassisPowerSupply().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisPowerSupply }
     * 
     * 
     */
    public List<ChassisPowerSupply> getChassisPowerSupply() {
        if (chassisPowerSupply == null) {
            chassisPowerSupply = new ArrayList<ChassisPowerSupply>();
        }
        return this.chassisPowerSupply;
    }


    /**
     * Gets the value of the chassisIkvm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassisIkvm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChassisIkvm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisIkvmModel }
     * 
     * 
     */
    public List<ChassisIkvmModel> getChassisIkvm() {
        if (chassisIkvm == null) {
            chassisIkvm = new ArrayList<ChassisIkvmModel>();
        }
        return this.chassisIkvm;
    }


    /**
     * Gets the value of the chassisControllers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassisControllers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChassisControllers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisControllers }
     * 
     * 
     */
    public List<ChassisControllers> getChassisControllers() {
        if (chassisControllers == null) {
            chassisControllers = new ArrayList<ChassisControllers>();
        }
        return this.chassisControllers;
    }


    /**
     * Gets the value of the servers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getServers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisServerModel }
     * 
     * 
     */
    public List<ChassisServerModel> getServers() {
        if (servers == null) {
            servers = new ArrayList<ChassisServerModel>();
        }
        return this.servers;
    }


    /**
     * Gets the value of the chassisIoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassisIoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChassisIoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisIomModel }
     * 
     * 
     */
    public List<ChassisIomModel> getChassisIoms() {
        if (chassisIoms == null) {
            chassisIoms = new ArrayList<ChassisIomModel>();
        }
        return this.chassisIoms;
    }


    /**
     * Gets the value of the chassisStashStorages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassisStashStorages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChassisStashStorages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisStashStorage }
     * 
     * 
     */
    public List<ChassisStashStorage> getChassisStashStorages() {
        if (chassisStashStorages == null) {
            chassisStashStorages = new ArrayList<ChassisStashStorage>();
        }
        return this.chassisStashStorages;
    }


    /**
     * Gets the value of the chassisFans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassisFans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChassisFans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisFan }
     * 
     * 
     */
    public List<ChassisFan> getChassisFans() {
        if (chassisFans == null) {
            chassisFans = new ArrayList<ChassisFan>();
        }
        return this.chassisFans;
    }


    /**
     * Gets the value of the chassisPcis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassisPcis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChassisPcis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisPci }
     * 
     * 
     */
    public List<ChassisPci> getChassisPcis() {
        if (chassisPcis == null) {
            chassisPcis = new ArrayList<ChassisPci>();
        }
        return this.chassisPcis;
    }


    /**
     * Gets the value of the chassisTemperatureSensors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chassisTemperatureSensors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getChassisTemperatureSensors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ChassisTemperatureSensor }
     * 
     * 
     */
    public List<ChassisTemperatureSensor> getChassisTemperatureSensors() {
        if (chassisTemperatureSensors == null) {
            chassisTemperatureSensors = new ArrayList<ChassisTemperatureSensor>();
        }
        return this.chassisTemperatureSensors;
    }

}
