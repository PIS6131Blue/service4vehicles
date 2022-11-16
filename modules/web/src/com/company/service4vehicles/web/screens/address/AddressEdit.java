package com.company.service4vehicles.web.screens.address;

import com.haulmont.cuba.gui.screen.*;
import com.company.service4vehicles.entity.Address;

@UiController("SERVICE_FOR_VEHICLES.edit")
@UiDescriptor("address-edit.xml")
@EditedEntityContainer("addressDc")
@LoadDataBeforeShow
public class AddressEdit extends StandardEditor<Address> {
}