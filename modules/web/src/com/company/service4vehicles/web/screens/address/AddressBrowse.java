package com.company.service4vehicles.web.screens.address;

import com.haulmont.cuba.gui.screen.*;
import com.company.service4vehicles.entity.Address;

@UiController("SERVICE_FOR_VEHICLES.browse")
@UiDescriptor("address-browse.xml")
@LookupComponent("addressesTable")
@LoadDataBeforeShow
public class AddressBrowse extends StandardLookup<Address> {
}