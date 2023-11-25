package com.chtrembl.petstore.order.service;

import com.chtrembl.petstore.order.model.Order;
import com.chtrembl.petstore.order.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{
    static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    private final OrderRepository orderRepository;

    @Override
    public void save(Order order) {
        try {
            log.info("Saving order={} to database", order);
            orderRepository.save(order);
        } catch (Exception e) {
            log.error("Error while saving order={}", order, e);
        }
    }

    @Override
    public Order findById(String id) {
        return orderRepository.findById(id);
    }
}
