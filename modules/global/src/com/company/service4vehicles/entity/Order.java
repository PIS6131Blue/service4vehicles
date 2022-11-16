package com.company.service4vehicles.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Table(name = "SERVICE4VEHICLES_ORDER")
@Entity(name = "service4vehicles_Order")
@NamePattern("%s|client")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 4981720313971408399L;

    @Column(name = "START_TIME")
    @NotNull
    private LocalDateTime start_time;

    @NotNull
    @Column(name = "DONE", nullable = false)
    private Boolean done = false;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID")
    @NotNull
    private Address address;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    @NotNull
    private Client client;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "clear"})
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ID")
    @NotNull
    private Service service;

    @Column(name = "END_TIME")
    @NotNull
    private LocalDateTime end_time;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDateTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalDateTime end_time) {
        this.end_time = end_time;
    }

    public LocalDateTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalDateTime start_time) {
        this.start_time = start_time;
    }
}