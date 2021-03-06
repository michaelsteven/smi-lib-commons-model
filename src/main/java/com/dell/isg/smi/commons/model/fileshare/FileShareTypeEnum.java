/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.fileshare;

public enum FileShareTypeEnum {
    CIFS, NFS;

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
     * @return the file share type enum
     */
    public static FileShareTypeEnum fromValue(String v) {
        return valueOf(v);
    }
}
