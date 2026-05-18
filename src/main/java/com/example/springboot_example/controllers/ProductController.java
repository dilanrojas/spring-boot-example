package com.example.springboot_example.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_example.dtos.ProductDto;
import com.example.springboot_example.facade.IProductFacade;
import com.example.springboot_example.mappers.ProductMapper;
import com.example.springboot_example.models.ProductRequestModel;
import com.example.springboot_example.models.ProductResponseModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private IProductFacade productFacade;
  
  @Autowired
  private ProductMapper productMapper;

  @GetMapping
  public ResponseEntity<List<ProductResponseModel>> findAll() {
    return ResponseEntity.ok(productMapper.toProductResponseModelList(productFacade.getAll()));
  }

  @PostMapping
  public ProductDto save(@RequestBody ProductRequestModel productRequestModel) {
    var dto = productMapper.toProductRequestDto(productRequestModel);
    return productFacade.addProduct(dto);
  }
  
  @GetMapping(path = "/{resourceId}")
  public ProductDto findById(@PathVariable("resourceId") UUID resourceId) {
    return productFacade.getByResourceId(resourceId);
  }

}
