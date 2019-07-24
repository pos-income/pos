package com.service;

import com.pojo.Bill;
import com.pojo.Money;
import com.pojo.Users;

import java.util.List;
import java.util.Map;

public interface MoneyService {
    /**
     * 新增资金变动
     * @param money
     * @return
     */
    Map<String,Object> addMoneyService(Money money, List<Bill> args, Users users);

//    Map<String,Object> findMoneyService(Money money);

    /**
     * 查询所有资金变动的列表
     * @param page
     * @return
     */
    Map<String,Object> findMoneyAllService(Integer page);
}
