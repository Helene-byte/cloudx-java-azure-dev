package com.chtrembl.petstore.order.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.chtrembl.petstore.order.model.Order;
//import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrder extends CosmosRepository<Order,String> {
}
