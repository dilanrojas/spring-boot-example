package com.example.springboot_example.models;

import java.math.BigDecimal;

public record ProductResponseModel (
  String name,
  String description,
  BigDecimal price
) { }
