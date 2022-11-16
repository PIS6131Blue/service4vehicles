package com.company.service4vehicles.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ServiceType implements EnumClass<String> {

    WASHING("WASHING"),
    TIRE_FITTING("TIRE_FITTING");

    private String id;

    ServiceType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ServiceType fromId(String id) {
        for (ServiceType at : ServiceType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}