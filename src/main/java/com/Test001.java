package com;

import com.pojo.*;
import com.service.MoneyService;
import com.service.impl.MoneyServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public  class Test001 {
    public static void main(String[] args) {

        Money money = new Money();
        MoneyService moneyDao =new MoneyServiceImpl();
        money.setBid("123");
        money.setResidue(new BigDecimal(22));
        money.setTime("2019-7-25");
        money.setIncome(new BigDecimal(22));
        money.setOutcome(new BigDecimal(22));
        money.setUid(10);
        Bill bill = new Bill(null,"123",1,2);
        Bill bill1 = new Bill(null,"123",2,2);
        Bill bill2 = new Bill(null,"123",3,2);
        List<Bill> list = new ArrayList<>();
        list.add(bill);
        list.add(bill1);
        list.add(bill2);
        System.out.println(moneyDao.addMoneyService(money, list));
    }
}
