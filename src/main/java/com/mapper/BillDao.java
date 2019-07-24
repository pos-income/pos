package com.mapper;

import com.pojo.Bill;

import java.sql.Connection;
import java.util.List;

/**
 *
 */
public interface BillDao {

    Integer addBill(Connection conn,Bill bill);

    /*Bill findBill(Bill bill);*/

    List<Bill> findBillAll(Bill bill);
}
