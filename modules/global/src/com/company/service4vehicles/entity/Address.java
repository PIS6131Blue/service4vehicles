package com.company.service4vehicles.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "SERVICE_FOR_VEHICLES")
@Entity(name = "SERVICE_FOR_VEHICLES")
@NamePattern("%s, %s, %s|city_name, street_name, house_number")
public class Address extends StandardEntity {
    private static final long serialVersionUID = -3289642172779592200L;

    @Column(name = "CITY_NAME")
    @NotNull
    private String city_name;

    @Column(name = "STREET_NAME")
    @NotNull
    private String street_name;

    @Column(name = "HOUSE_NUMBER")
    @NotNull
    private String house_number;

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}