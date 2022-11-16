package com.company.service4vehicles.web.screens.service;

import com.haulmont.cuba.gui.screen.*;
import com.company.service4vehicles.entity.Service;

@UiController("service4vehicles_Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
@LoadDataBeforeShow
public class ServiceEdit extends StandardEditor<Service> {
}