package com.example.springboot_example.services;

import java.util.List;

import com.example.springboot_example.entities.Product;

public interface IProductService {
  List<Product> getAll();  
}
