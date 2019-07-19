package com.mapper;

import com.pojo.Products;

import java.util.List;

public interface ProductsDao {

    Integer addProducts(Products products);

    Products findProducts(Products products);

    List<Products> findProductsAll(Products products);
}
