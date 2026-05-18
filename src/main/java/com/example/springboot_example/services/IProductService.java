package com.example.springboot_example.services;

import java.util.List;
import java.util.UUID;

import com.example.springboot_example.dtos.ProductRequestDto;
import com.example.springboot_example.entities.Product;

public interface IProductService {
  List<Product> getAll();  
  Product addProduct(ProductRequestDto product);
  Product getByResourceId(UUID resourceId);
  Product updateProduct(UUID resourceId, ProductRequestDto productDto);
}
