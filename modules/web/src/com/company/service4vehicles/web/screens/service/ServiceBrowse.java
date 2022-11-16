package com.company.service4vehicles.web.screens.service;

import com.haulmont.cuba.gui.screen.*;
import com.company.service4vehicles.entity.Service;

@UiController("service4vehicles_Service.browse")
@UiDescriptor("service-browse.xml")
@LookupComponent("servicesTable")
@LoadDataBeforeShow
public class ServiceBrowse extends StandardLookup<Service> {
}