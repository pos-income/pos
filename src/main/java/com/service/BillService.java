package com.service;

import com.pojo.Bill;
import com.pojo.Money;

import java.util.Map;

public interface BillService {
    /**
     * 新增账单信息
     * @param bill
     * @return
     */
    Map<String,Object> addBillService(Bill bill);

    /**
     * 根据账单号Bid获取账单信息
     * @param bill
     * @return
     */
    Map<String,Object> findBillService(Bill bill);
    /**
     * 查询所有信息
     * @param page 页码
     * @return
     */
    Map<String,Object> findBillAllService(Integer page);
}
