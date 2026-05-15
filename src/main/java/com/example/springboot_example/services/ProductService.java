package com.example.springboot_example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_example.entities.Product;
import com.example.springboot_example.repositories.ProductRepository;

@Service
public class ProductService implements IProductService {
  @Autowired
  private ProductRepository productRepository;

  @Override
  public List<Product> getAll() {
    return productRepository.getAll();
  }
}
