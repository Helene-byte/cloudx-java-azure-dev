package com.chtrembl.petstore.order.service;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.chtrembl.petstore.order.model.ContainerEnvironment;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class OrderReservationServiceImpl implements OrderReservationService{

    private static final Logger logger = LoggerFactory.getLogger(OrderReservationServiceImpl.class);
    private final ContainerEnvironment containerEnvironment;

    public OrderReservationServiceImpl(ContainerEnvironment containerEnvironment) {
        this.containerEnvironment = containerEnvironment;

    }

    public void updateOrder(String orderJson) {

        try (ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
                .connectionString(this.containerEnvironment.getServiceBusConnectionString())
                .sender()
                .queueName(this.containerEnvironment.getQueueName())
                .buildClient()) {


            ServiceBusMessage message = new ServiceBusMessage(orderJson);
            senderClient.sendMessage(message);

            logger.info("Message sent to Azure Service Bus: {}", orderJson);
        } catch (Exception e) {
            logger.error("Error sending message to Azure Service Bus", e);
        }
    }
}