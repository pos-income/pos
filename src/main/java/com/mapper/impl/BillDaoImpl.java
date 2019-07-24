package com.mapper.impl;

import com.config.JdbcTemplate;
import com.mapper.BillDao;
import com.pojo.Bill;

import java.sql.Connection;
import java.util.List;

public class BillDaoImpl implements BillDao {
    JdbcTemplate<Bill> jdbcTemplate =new JdbcTemplate<>();

    /**
     *添加账单信息
     * @param bill
     * @return
     */
    @Override
    public Integer addBill(Connection conn, Bill bill) {
        Integer addBillMethed = JdbcTemplate.update(conn,"insert into bill(Bid,Pid,ProductCount) value(?,?,?)",
                bill.getBid(), bill.getPid(), bill.getProductCount());
        return addBillMethed;
    }

   /* @Override
    public Bill findBill(Bill bill) {
        return null;
    }*/

    /**
     * 通过Bid 查询所有账单信息
     * @param bill
     * @return
     */
    @Override
    public List<Bill> findBillAll(Bill bill) {
        List<Bill> findBillAllMethed = jdbcTemplate.query("select b.Bid,p.ProductName,p.Counts,p.prices,p.Counts*p.prices as SUM_prices from bill as b,products as p where b.Bid=? and b.Pid=p.id limit 0,5",
                new Bill(),null);
        return findBillAllMethed;
    }
}
