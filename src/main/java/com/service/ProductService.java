package com.service;

import com.pojo.Products;

import java.util.Map;

public interface ProductService {
    Map<String,Object> addProductService(Products products);
    Map<String,Object> findProductsService(Products products);
    Map<String,Object> findProductsAllService(Products products);
    Map<String,Object> saveProductsAllService(Products products);
}
