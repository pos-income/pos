package com.service.impl;

import com.config.UtilsCache;
import com.mapper.ProductsDao;
import com.mapper.impl.ProductsDaoImpl;
import com.pojo.Products;
import com.pojo.Users;
import com.service.LoggerService;
import com.service.ProductService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private ProductsDao productsDao = new ProductsDaoImpl();
    private LoggerService loggerService = new LoggerServiceImpl();
    @Override
    public Map<String, Object> addProductService(Products products) {
        Map<String, Object> map = new HashMap<>();
        if(products==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else{
            Integer integer = productsDao.addProducts(products);
            if (integer>0){
                map.put("code",200);
                map.put("msg","添加成功");
            }else {
                map.put("code",-4);
                map.put("msg","添加失败");
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> findProductsService(Products products) {
        Map<String, Object> map = new HashMap<>();
        if(products==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else {
            Products products1 = productsDao.findProducts(products);
            if (products1==null){
                map.put("code",-5);
                map.put("msg","该商品不存在");
            }else {
                map.put("code",200);
                map.put("msg","查询成功");
                map.put("product",products1);
            }
        }
        return map;
    }

    @Override
    public Map<String, Object> findProductsAllService(Products products,Integer page) {
        Map<String, Object> map = new HashMap<>();
        List<Products> productsUtils = UtilsCache.getProductsUtils();
        if (page==null){
            page = 1;
        }
        Integer start = 5*(page-1);//起始下标
        if (productsUtils.size()>start){
            Integer end;//结束下标
            if (productsUtils.size()-start>=5){
                end = start+5;
            }else {
                end = productsUtils.size();
            }
            map.put("userList",productsUtils.subList(start,end));
            map.put("count",productsUtils.size());
        }else{
            map.put("code",-5);
            map.put("msg","没有更多商品");
        }
        return map;
    }

    @Override
    public Map<String, Object> saveProductsAllService(Products products,Users users) {
        Map<String, Object> map = new HashMap<>();
        if(products==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else {
            Integer integer = productsDao.updateAll(products);
            if (integer>0){
                //添加日志
                loggerService.addLogger(users.getId(),"修改了商品信息");
                //清空缓存
                UtilsCache.getProductsUtils();
                map.put("code",200);
                map.put("msg","修改成功");
            }else {
                map.put("code",-3);
                map.put("msg","修改失败");
            }
        }
        return map;
    }
}
