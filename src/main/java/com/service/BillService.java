package com.service;

import com.pojo.Bill;
import com.pojo.Money;

import java.util.Map;

public interface BillService {
    Map<String,Object> addBillService(Bill bill);

    Map<String,Object> findBillService(Bill bill);

    Map<String,Object> findBillAllService(Bill bill);
}
