package com.pojo;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
/**
 * 账单类
 */
public class Bill extends Products{
    //账单id
    private Integer Id;
    //资金账单id
    private Integer Bid;
    //售出商品id
    private Integer Pid;
    //商品售出数量
    private Integer ProductCount;

    public void setId(Integer id) {
        Id = id;
    }

    public void setBid(Integer bid) {
        Bid = bid;
    }

    public void setPid(Integer pid) {
        Pid = pid;
    }

    public void setProductCount(Integer productCount) {
        ProductCount = productCount;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getBid() {
        return Bid;
    }

    public Integer getPid() {
        return Pid;
    }

    public Integer getProductCount() {
        return ProductCount;
    }
}
