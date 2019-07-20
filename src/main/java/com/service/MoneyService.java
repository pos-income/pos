package com.service;

import com.pojo.Money;

import java.util.Map;

public interface MoneyService {
    Map<String,Object> addMoneyService(Money money);

    Map<String,Object> findMoneyService(Money money);

    Map<String,Object> findMoneyAllService(Money money);
}
