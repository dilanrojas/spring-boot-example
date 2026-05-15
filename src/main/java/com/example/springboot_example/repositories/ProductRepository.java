package com.example.springboot_example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot_example.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  default List<Product> getAll() {
    return findAll();
  }
}
