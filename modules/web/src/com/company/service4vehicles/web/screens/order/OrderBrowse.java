package com.company.service4vehicles.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.service4vehicles.entity.Order;

@UiController("service4vehicles_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}