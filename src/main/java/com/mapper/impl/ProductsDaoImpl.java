package com.mapper.impl;

import com.config.JdbcTemplate;
import com.mapper.ProductsDao;
import com.pojo.Products;

import java.util.List;

public class ProductsDaoImpl implements ProductsDao {
    /**
     *
     */
    JdbcTemplate<Products> jdbcTemplate =new JdbcTemplate<>();

    @Override
    public Integer addProducts(Products products) {
        Integer update = JdbcTemplate.update("insert into products () value()");
        return update;
    }

    @Override
    public Integer update(Products products) {
        return null;
    }

    @Override
    public Products findProducts(Products products) {
        return null;
    }

    @Override
    public List<Products> findProductsAll(Products products) {
        return null;
    }
}
