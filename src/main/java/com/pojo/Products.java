package com.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
/**
 * 商品类
 */
public class Products {
    //商品id
    private Integer Id;
    //商品名称
    private String ProductName;
    //商品数量
    private Integer Counts;
    //商品价格
    private Double Prices;

    public Integer getId() {
        return Id;
    }

    public String getProductName() {
        return ProductName;
    }

    public Integer getCounts() {
        return Counts;
    }

    public Double getPrices() {
        return Prices;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public void setCounts(Integer counts) {
        Counts = counts;
    }

    public void setPrices(Double prices) {
        Prices = prices;
    }

    @Override
    public String toString() {
        return "Products{" +
                "Id=" + Id +
                ", ProductName='" + ProductName + '\'' +
                ", Counts=" + Counts +
                ", Prices=" + Prices +
                '}';
    }
}
