package com.company.service4vehicles.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "SERVICE4VEHICLES_SERVICE")
@Entity(name = "service4vehicles_Service")
@NamePattern("%s|name")
public class Service extends StandardEntity {
    private static final long serialVersionUID = 7981374914205126070L;

    @Column(name = "NAME")
    @NotNull
    private String name;

    @Column(name = "PRICE")
    @NotNull
    private Long price;

    @Column(name = "SERVICE_TYPE")
    @NotNull
    private String service_type;

    public ServiceType getService_type() {
        return service_type == null ? null : ServiceType.fromId(service_type);
    }

    public void setService_type(ServiceType service_type) {
        this.service_type = service_type == null ? null : service_type.getId();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}