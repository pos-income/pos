package com.mapper.ProductsDao;

import com.config.JdbcTemplate;
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
        Integer update = JdbcTemplate.update(null,"insert into products (ProductName,Counts,Prices) value(?,?,?)",
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
        Integer updateProductsMethed = JdbcTemplate.update(null,"update products set Counts=Counts-? where id=?",
                products.getCounts(),products.getId());
        return updateProductsMethed;
    }

    /**
     * 修改商品 通过ID 返回受影响行数
     * @param products
     * @return
     */
    @Override
    public Integer updateAll(Products products) {
        Integer updateAllProductsMethed = JdbcTemplate.update(null,"update products set Counts=?,ProductName=?,Prices=? where Id=?",
                products.getCounts(),products.getProductName(),products.getPrices(),products.getId());
        return updateAllProductsMethed;
    }

    /**
     * 通过商品名字查询单个商品
     * @param products
     * @return
     */
    @Override
    public Products findProducts(Products products) {
        List<Products> query = jdbcTemplate.query("select * from products where ProductName=?",
                new Products(),products.getProductName());
        if (query!=null){
            if (query.size()>0){
                Products findProductsMethed=(Products)query.get(0);
                return findProductsMethed;
            }

        }
        return null;
    }
    /**
     * 通过Counts 查所有商品并进行分页
     * @param products
     * @return
     */
    @Override
    public List<Products> findProductsAll(Products products) {
        List<Products> findProductsAllMethed = jdbcTemplate.query("select * from products ",
                new Products(),null);
        return findProductsAllMethed;
    }

    /**
     *通过传入的值进行模糊查询Id和ProductName
     * @param
     * @return
     */
    @Override
    public List<Products> likeIdProducts(String s) {
        List<Products> likeIdProductsMethed = jdbcTemplate.query("select * from products where Id like '%"+s+"%' or ProductName like '%"+s+"%'",
                new Products(),null);
        return likeIdProductsMethed;
    }


    /**
     *通过name模糊查询
     * @param products
     * @return
     */
   /* @Override
    public List<Products> likeNameProducts(Products products) {
        List<Products> likeNameProductsMethed = jdbcTemplate.query("",
                new Products(), products.getProductName());
        return likeNameProductsMethed;
    }*/
}
