package com.mapper.impl;

import com.config.JdbcTemplate;
import com.mapper.MoneyDao;
import com.pojo.Money;

import java.util.List;

public class MoneyDaoImpl implements MoneyDao {

    JdbcTemplate <Money>jdbcTemplate = new JdbcTemplate<>();

    /**
     * 添加资金
     * @param money
     * @return
     */
    @Override
    public Integer addMoney(Money money) {
        Integer updateAddMoneyMethed = JdbcTemplate.update("insert into money (Time,Income,Outcome,residue,Uid,Bid) value(?,?,?,?,?,?)",
                money.getTime(), money.getIncome(), money.getOutcome(), money.getResidue(), money.getUid(), money.getBid());
        return updateAddMoneyMethed;
    }

    /**
     *
     * @param money
     * @return
     */
    /*@Override
    public Money findMoney(Money money) {
        jdbcTemplate.query("select ",money);
        return null;
    }*/

    /**
     * 通过Time 查询所有资金信息
     * @param money
     * @return
     */
    @Override
    public List<Money> findMoneyAll(Money money) {
        List<Money> findMoneyAllMethed = jdbcTemplate.query("select * from money order by Time limit 0,5",
                new Money(),null);
        return findMoneyAllMethed;
    }
}
