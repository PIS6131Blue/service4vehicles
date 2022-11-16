package com.company.service4vehicles.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.service4vehicles.entity.Client;

@UiController("service4vehicles_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}