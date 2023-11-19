package com.chtrembl.petstore.order.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.chtrembl.petstore.order.model.Product;
import org.springframework.stereotype.Repository;

//import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;
@Repository
public interface IProduct extends CosmosRepository<Product, String> {
}
