package com.company.service4vehicles.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.service4vehicles.entity.Order;

@UiController("service4vehicles_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}