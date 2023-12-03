package com.chtrembl.petstore.order.service;

import com.chtrembl.petstore.order.model.ContainerEnvironment;
import com.chtrembl.petstore.order.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import javax.validation.Valid;

@Component
public class OrderReservationServiceImpl implements OrderReservationService{

    private static final Logger logger = LoggerFactory.getLogger(OrderReservationServiceImpl.class);
    private WebClient orderReservationFnWebClient = null;
//    private final User sessionUser;
    private final ContainerEnvironment containerEnvironment;


    public OrderReservationServiceImpl(ContainerEnvironment containerEnvironment) {
        this.containerEnvironment = containerEnvironment;
    }

    public void updateOrder(@Valid Order request) {

        try {
            this.orderReservationFnWebClient.post()
                    .uri("updateshoppingcart")
                    .contentType(MediaType.APPLICATION_JSON)
                    .header("Cache-Control", "no-cache")
                    .bodyValue(request)
                    .retrieve();
//        .bodyToMono(String.class)
//        .block()
            logger.info("PetStoreOrderService: order={} reserved", request);
        } catch (Exception e) {
            logger.error("PetStoreOrderService: error while reserving order={}", request, e);
        }
    }
}