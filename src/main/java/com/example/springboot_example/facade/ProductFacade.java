package com.example.springboot_example.facade;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springboot_example.dtos.ProductDto;
import com.example.springboot_example.dtos.ProductRequestDto;
import com.example.springboot_example.mappers.ProductMapper;
import com.example.springboot_example.services.IProductService;

import jakarta.transaction.Transactional;

@Component
public class ProductFacade implements IProductFacade {
  @Autowired
  private IProductService productService;
  
  @Autowired
  private ProductMapper productMapper;

  @Override
  public List<ProductDto> getAll() {
    return productMapper.toProductDtoList(productService.getAll());
  }

  @Override
  @Transactional
  public ProductDto addProduct(ProductRequestDto productDto) {
    var entity = productService.addProduct(productDto);
    return productMapper.toProductDto(entity);
  }

  @Override
  public ProductDto getByResourceId(UUID resourceId) {
    var entity = productService.getByResourceId(resourceId);
    return productMapper.toProductDto(entity);
  }
}
