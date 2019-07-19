package com.mapper;

import com.pojo.Money;

import java.util.List;

public interface MoneyDao {
    Integer addMoney(Money money);

    Money findMoney(Money money);

    List<Money> findMoneyAll(Money money);

}
