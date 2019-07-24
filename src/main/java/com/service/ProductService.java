package com.service;

import com.pojo.Products;
import com.pojo.Users;

import java.util.Map;

public interface ProductService {
    /**
     * 新增商品
     * @param products 新增商品的信息
     * @return
     */
    Map<String,Object> addProductService(Products products,Users users);

    /**
     * 根据商品名称查询商品信息
     * @param products 商品查询信息（商品名称）
     * @return
     */
    Map<String,Object> findProductsService(Products products);

    /**
     * 查询所有商品信息
     * @param products
     * @param page 页码
     * @return
     */
    Map<String,Object> findProductsAllService(Products products,Integer page);

    /**
     * 修改商品信息
     * @param products
     * @param users 用户信息
     * @return
     */
    Map<String,Object> saveProductsAllService(Products products, Users users);

    /**
     * 通过传入Id或者name进行模糊查询
     * @param s
     * @return
     */
    Map<String,Object> likeIdProductsService(String s);
}
