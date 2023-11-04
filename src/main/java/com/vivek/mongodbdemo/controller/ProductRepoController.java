package com.vivek.mongodbdemo.controller;

import com.vivek.mongodbdemo.model.Product;
import com.vivek.mongodbdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author viveksoni
 */

@RestController
@RequestMapping("/products-repo")
public class ProductRepoController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

}
