package com.chtrembl.petstore.order.repository;

import com.chtrembl.petstore.order.model.Product;
import com.microsoft.azure.spring.data.cosmosdb.repository.CosmosRepository;

public interface IProduct extends CosmosRepository<Product, String> {
}
