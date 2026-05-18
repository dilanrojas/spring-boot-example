package com.example.springboot_example.facade;

import java.util.List;
import java.util.UUID;

import com.example.springboot_example.dtos.ProductDto;
import com.example.springboot_example.dtos.ProductRequestDto;

public interface IProductFacade {
  List<ProductDto> getAll();  
  ProductDto addProduct(ProductRequestDto productDto);
  ProductDto getByResourceId(UUID resourceId);
  ProductDto updateProduct(UUID resourceId, ProductRequestDto productDto);
}
