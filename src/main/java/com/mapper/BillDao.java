package com.mapper;

import com.pojo.Bill;

import java.util.List;

/**
 *
 */
public interface BillDao {

    Integer addBill(Bill bill);

    /*Bill findBill(Bill bill);*/

    List<Bill> findBillAll(Bill bill);
}
