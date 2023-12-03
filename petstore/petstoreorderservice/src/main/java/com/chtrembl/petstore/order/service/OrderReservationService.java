package com.chtrembl.petstore.order.service;

import com.chtrembl.petstore.order.model.Order;

import javax.validation.Valid;

public interface OrderReservationService {
    void updateOrder(@Valid Order body);
}
