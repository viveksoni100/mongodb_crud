package com.vivek.mongodbdemo.controller;

import com.vivek.mongodbdemo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

/**
 * @author viveksoni
 */

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private MongoTemplate mongoTemplate;


    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return mongoTemplate.save(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return mongoTemplate.findById(id, Product.class);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product updatedProduct) {
        return mongoTemplate.save(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        mongoTemplate.remove(Query.query(Criteria.where("id").is(id)), Product.class);
    }

}
