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

    /**
     * 增加商品
     * @param products
     * @return
     */
    @Override
    public Integer addProducts(Products products) {
        Integer update = JdbcTemplate.update("insert into products (ProductName,Counts,Prices) value(?,?,?)",
                products.getProductName(),products.getCounts(),products.getPrices());
        return update;
    }

    /**
     * 商品出售 通过ID 返回受影响行数
     * @param products
     * @return
     */
    @Override
    public Integer update(Products products) {
        Integer update = JdbcTemplate.update("update products set Counts=Counts-? where id=?",
                products.getId());
        return update;
    }

    /**
     * 修改商品 通过ID 返回受影响行数
     * @param products
     * @return
     */
    @Override
    public Integer updateAll(Products products) {
        Integer update = JdbcTemplate.update("update products set Counts=?,ProductName=?,Price=? where Id=?",
                products.getId());
        return update;
    }

    /**
     * 通过商品名字查询单个商品
     * @param products
     * @return
     */
    @Override
    public Products findProducts(Products products) {
        List<Products> query = jdbcTemplate.query("select * from products where ProductName=?",
                products.getProductName());
        Products products1=(Products)query.get(0);
        return products1;
    }

    /**
     * 通过Counts 查所有商品并进行分页
     * @param products
     * @return
     */
    @Override
    public List<Products> findProductsAll(Products products) {
        List<Products> queryAll = jdbcTemplate.query("select * from products order by Counts desc limt 0,5",
                products.getCounts());
        return queryAll;
    }
}
