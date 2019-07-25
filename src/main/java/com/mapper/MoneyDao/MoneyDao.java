package com.mapper.MoneyDao;

import com.pojo.Money;

import java.sql.Connection;
import java.util.List;

/**
 * 资金的增加、查找
 */
public interface MoneyDao {
    //增加资金的方法接口  返回受影响行数
    Integer addMoney(Connection conn, Money money);
    //查找一条资金方法  返回查到的资金信息
     //List<Money> findMoney(Money money);
    //查找多条资金  返回一个集合数组
    List<Money> findMoneyAll(Money money);


}
