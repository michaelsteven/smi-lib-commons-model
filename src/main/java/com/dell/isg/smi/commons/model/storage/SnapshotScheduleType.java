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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum SnapshotScheduleType.
 */
@XmlType(name = "SnapshotScheduleType")
@XmlEnum
public enum SnapshotScheduleType {

    DAILY, WEEKLY, MONTHLY_DATES, MONTHLY_DAYS;

    /**
     * Value.
     *
     * @return the string
     */
    public String value() {
        return name();
    }


    /**
     * From value.
     *
     * @param v the v
     * @return the snapshot schedule type
     */
    public static SnapshotScheduleType fromValue(String v) {
        return valueOf(v);
    }

}
