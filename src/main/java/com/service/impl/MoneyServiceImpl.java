package com.service.impl;

import com.config.JdbcUtils;
import com.config.UtilsCache;
import com.mapper.BillDao;
import com.mapper.MoneyDao;
import com.mapper.impl.BillDaoImpl;
import com.mapper.impl.MoneyDaoImpl;
import com.pojo.Bill;
import com.pojo.Money;
import com.pojo.Products;
import com.pojo.Users;
import com.service.LoggerService;
import com.service.MoneyService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoneyServiceImpl implements MoneyService {
    private MoneyDao moneyDao=new MoneyDaoImpl();
    private BillDao billDao = new BillDaoImpl();
    private LoggerService loggerService = new LoggerServiceImpl();
    @Override
    public Map<String, Object> addMoneyService(Money money, List<Bill> args, Users users) {
        Map<String, Object> map = new HashMap<>();
        if (money==null){
            map.put("code",0);
            map.put("msg","参数不能为空");
        }else if (args.size()<1){
            map.put("code",0);
            map.put("msg","账单信息不能为空");
        }else {
            Connection conn = JdbcUtils.getConn();
            try {
                conn.setAutoCommit(false);
                Integer integer = moneyDao.addMoney(conn, money);
                if (integer<=0){
                    conn.rollback();
                    map.put("code",-5);
                    map.put("msg","资金变更信息添加失败");
                }else {
                    for (Bill bill:args) {
                        billDao.addBill(conn,bill);
                        if (integer<=0){
                            conn.rollback();
                            map.put("code",-5);
                            map.put("msg","账单信息添加失败");
                        }
                    }
                    conn.commit();
                    //添加日志
                    loggerService.addLogger(users.getId(),"完成了一次交易");
                    //清空缓存
                    UtilsCache.setBillUtils();
                    UtilsCache.setMoneyUtils();
                    map.put("code",200);
                    map.put("msg","添加成功");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }
        return null;
    }

    @Override
    public Map<String, Object> findMoneyAllService(Integer page) {
        Map<String, Object> map = new HashMap<>();
        if (page==null){
            page = 1;
        }
        List<Money> monies = UtilsCache.getMoneyUtils();
        Integer start = 5*(page-1);//起始下标
        if (monies.size()>start){
            Integer end;//结束下标
            end = start+5;
            if (monies.size()-start>=5){
            }else {
                end = monies.size();
            }
            map.put("userList",monies.subList(start,end));
            map.put("count",monies.size());
        }else{
            map.put("code",-5);
            map.put("msg","没有更多信息");
        }
        return map;
    }
}
