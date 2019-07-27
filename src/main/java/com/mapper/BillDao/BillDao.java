package com.mapper.BillDao;

import com.pojo.Bill;

import java.sql.Connection;
import java.util.List;

/**
 *
 */
public interface BillDao {

    Integer addBill(Connection conn,Bill bill);

    List<Bill> findBillAll(Bill bill);
}
