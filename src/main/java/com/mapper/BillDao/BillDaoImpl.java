package com.mapper.BillDao;

import com.config.JdbcTemplate;
import com.mapper.BillDao.BillDao;
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

       //通过Bid查询账单信息
    @Override
    public List<Bill> findBill(Bill bill) {
        List<Bill> findBillMethed = jdbcTemplate.query("select * from bill where Bid=?",
                new Bill(), bill.getBid());
        return findBillMethed;
    }

    /**
     * 通过Bid 查询所有账单信息
     * @param bill
     * @return
     */
    @Override
    public List<Bill> findBillAll(Bill bill) {
       List<Bill> findBillAllMethed = jdbcTemplate.query("select * from bill where Bid=?",
                new Bill(), bill.getBid());
        return findBillAllMethed;
    }
}
