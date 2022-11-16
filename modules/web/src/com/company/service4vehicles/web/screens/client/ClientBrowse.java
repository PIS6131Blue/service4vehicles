package com.company.service4vehicles.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.service4vehicles.entity.Client;

@UiController("service4vehicles_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}