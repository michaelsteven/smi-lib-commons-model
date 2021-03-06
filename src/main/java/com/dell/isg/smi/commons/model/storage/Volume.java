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
 * The Class Volume.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Volume", propOrder = { "id", "instanceId", "name", "active", "mapped", "storageSize", "snapshotScheduleId", "storageSizeType", "snapshotScheduleType", "performanceProfile", "health", "fullIn", "used", "free" })
public class Volume {

    protected long id;
    @XmlElement(required = true)
    protected String instanceId;
    @XmlElement(required = true)
    protected String name;
    protected boolean active;
    protected boolean mapped;
    protected double storageSize;
    protected long snapshotScheduleId;
    @XmlElement(required = true)
    protected StorageSizeType storageSizeType;
    @XmlElement(required = true)
    protected SnapshotScheduleType snapshotScheduleType;
    @XmlElement(required = true)
    protected StoragePerformanceProfile performanceProfile;
    @XmlElement(required = true)
    protected String health;
    protected int fullIn;
    protected double used;
    protected double free;


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
     * Gets the value of the instanceId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getInstanceId() {
        return instanceId;
    }


    /**
     * Sets the value of the instanceId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
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
     * Gets the value of the active property.
     *
     * @return true, if is active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the value of the active property.
     *
     * @param value the new active
     */
    public void setActive(boolean value) {
        this.active = value;
    }


    /**
     * Gets the value of the mapped property.
     *
     * @return true, if is mapped
     */
    public boolean isMapped() {
        return mapped;
    }


    /**
     * Sets the value of the mapped property.
     *
     * @param value the new mapped
     */
    public void setMapped(boolean value) {
        this.mapped = value;
    }


    /**
     * Gets the value of the storageSize property.
     *
     * @return the storage size
     */
    public double getStorageSize() {
        return storageSize;
    }


    /**
     * Sets the value of the storageSize property.
     *
     * @param value the new storage size
     */
    public void setStorageSize(double value) {
        this.storageSize = value;
    }


    /**
     * Gets the value of the snapshotScheduleId property.
     *
     * @return the snapshot schedule id
     */
    public long getSnapshotScheduleId() {
        return snapshotScheduleId;
    }


    /**
     * Sets the value of the snapshotScheduleId property.
     *
     * @param value the new snapshot schedule id
     */
    public void setSnapshotScheduleId(long value) {
        this.snapshotScheduleId = value;
    }


    /**
     * Gets the value of the storageSizeType property.
     * 
     * @return possible object is {@link StorageSizeType }
     * 
     */
    public StorageSizeType getStorageSizeType() {
        return storageSizeType;
    }


    /**
     * Sets the value of the storageSizeType property.
     * 
     * @param value allowed object is {@link StorageSizeType }
     * 
     */
    public void setStorageSizeType(StorageSizeType value) {
        this.storageSizeType = value;
    }


    /**
     * Gets the value of the snapshotScheduleType property.
     * 
     * @return possible object is {@link SnapshotScheduleType }
     * 
     */
    public SnapshotScheduleType getSnapshotScheduleType() {
        return snapshotScheduleType;
    }


    /**
     * Sets the value of the snapshotScheduleType property.
     * 
     * @param value allowed object is {@link SnapshotScheduleType }
     * 
     */
    public void setSnapshotScheduleType(SnapshotScheduleType value) {
        this.snapshotScheduleType = value;
    }


    /**
     * Gets the value of the performanceProfile property.
     * 
     * @return possible object is {@link StoragePerformanceProfile }
     * 
     */
    public StoragePerformanceProfile getPerformanceProfile() {
        return performanceProfile;
    }


    /**
     * Sets the value of the performanceProfile property.
     * 
     * @param value allowed object is {@link StoragePerformanceProfile }
     * 
     */
    public void setPerformanceProfile(StoragePerformanceProfile value) {
        this.performanceProfile = value;
    }


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


    /**
     * Gets the value of the fullIn property.
     *
     * @return the full in
     */
    public int getFullIn() {
        return fullIn;
    }


    /**
     * Sets the value of the fullIn property.
     *
     * @param value the new full in
     */
    public void setFullIn(int value) {
        this.fullIn = value;
    }


    /**
     * Gets the value of the used property.
     *
     * @return the used
     */
    public double getUsed() {
        return used;
    }


    /**
     * Sets the value of the used property.
     *
     * @param value the new used
     */
    public void setUsed(double value) {
        this.used = value;
    }


    /**
     * Gets the value of the free property.
     *
     * @return the free
     */
    public double getFree() {
        return free;
    }


    /**
     * Sets the value of the free property.
     *
     * @param value the new free
     */
    public void setFree(double value) {
        this.free = value;
    }

}
