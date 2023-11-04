package com.vivek.mongodbdemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author viveksoni
 */

@Data
@Document
public class Product {

    @Id
    private String id;
    private String name;
    private double price;

}
