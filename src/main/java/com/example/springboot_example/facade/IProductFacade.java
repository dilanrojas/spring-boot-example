package com.example.springboot_example.facade;

import java.util.List;

import com.example.springboot_example.dtos.ProductDto;

public interface IProductFacade {
  List<ProductDto> getAll();  
}
