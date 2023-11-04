package com.vivek.mongodbdemo.repository;

import com.vivek.mongodbdemo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author viveksoni
 */

public interface ProductRepository extends MongoRepository<Product, String> {

}
