package com.mapper;

import com.pojo.Products;

import java.util.List;

/**
 * Dao层商品的曾加、查找
 */
public interface ProductsDao {
    //增加商品的方法接口  返回受影响行数
    Integer addProducts(Products products);
    //出售商品的方法接口  返回受影响行数  通过Pid修改
    Integer update(Products products);
    //修改商品的方法接口，返回受影响行数   通过ID修改
    Integer updateAll(Products products);
    //查找单个商品的方法接口  返回查到了商品信息
    Products findProducts(Products products);
    //查找多个商品的方法接口  返回一个集合数组
    List<Products> findProductsAll(Products products);
}
