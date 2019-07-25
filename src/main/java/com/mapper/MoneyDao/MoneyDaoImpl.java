package com.mapper.MoneyDao;

import com.config.JdbcTemplate;
import com.mapper.MoneyDao.MoneyDao;
import com.pojo.Money;

import java.sql.Connection;
import java.util.List;

public class MoneyDaoImpl implements MoneyDao {

    JdbcTemplate <Money>jdbcTemplate = new JdbcTemplate<>();

    /**
     * 添加资金
     * @param money
     * @return
     */
    @Override
    public Integer addMoney(Connection conn, Money money) {
        Integer updateAddMoneyMethed = JdbcTemplate.update(conn,"insert into money (Time,Income,Outcome,residue,Uid,Bid) value(?,?,?,?,?,?)",
                money.getTime(), money.getIncome(), money.getOutcome(), money.getResidue(), money.getUid(), money.getBid());
        return updateAddMoneyMethed;
    }

  /*  *//**
     *查询
     * @param money
     * @return
     *//*
    @Override
    public List<Money> findMoney(Money money) {
        List<Money> findMoneyMethed = jdbcTemplate.query("select a.*,b.Username from money a left join users b on a.uid=b.Id ",
                new Money(), null);
        return findMoneyMethed;
    }*/

    /**
     * 通过Time 查询所有资金信息
     * @param money
     * @return
     */
    @Override
    public List<Money> findMoneyAll(Money money) {
//        List<Money> findMoneyAllMethed = jdbcTemplate.query("select * from money order by Time",
//                new Money(),null);
        List<Money> findMoneyAllMethed = jdbcTemplate.query("select a.*,b.Username from money a left join users b on a.uid=b.Id order by a.Time",
                new Money(), null);
        return findMoneyAllMethed;
    }
}
