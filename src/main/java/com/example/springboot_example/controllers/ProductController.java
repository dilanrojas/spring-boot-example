package com.example.springboot_example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_example.facade.IProductFacade;
import com.example.springboot_example.mappers.ProductMapper;
import com.example.springboot_example.models.ProductResponseModel;

import org.springframework.web.bind.annotation.GetMapping;


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
}
