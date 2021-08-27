package com.dio.project3.controller;

import com.dio.project3.model.Product;
import com.dio.project3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {

        return productRepository.save(product);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Optional<Product> findByID(@PathVariable Integer id) {
        return productRepository.findById(id);
    }
}
