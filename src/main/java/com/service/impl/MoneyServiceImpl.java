package com.service.impl;

import com.config.JdbcUtils;
import com.config.UtilsCache;
import com.mapper.BillDao.BillDao;
import com.mapper.MoneyDao.MoneyDao;
import com.mapper.BillDao.BillDaoImpl;
import com.mapper.MoneyDao.MoneyDaoImpl;
import com.mapper.ProductsDao.ProductsDao;
import com.mapper.ProductsDao.ProductsDaoImpl;
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
    private ProductsDao productsDao = new ProductsDaoImpl();
    private LoggerService loggerService = new LoggerServiceImpl();
    @Override
    public Map<String, Object> addMoneyService(Money money, List<Bill> args) {
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
                    Products products = new Products();
                    Integer i = 0;
                    for (Bill bill:args) {
                        products.setCounts(bill.getProductCount());
                        products.setId(bill.getPid());
                        Integer update = productsDao.update(products);//商品数量修改
                        if (update<=0){
                            conn.rollback();
                            map.put("code",-3);
                            map.put("msg","商品数量修改失败");
                            i++;
                        }else {
                            Integer bill1 = billDao.addBill(conn, bill);//账单信息添加
                            if (integer<=0){
                                conn.rollback();
                                map.put("code",-5);
                                map.put("msg","账单信息添加失败");
                                i++;
                            }
                        }
                    }
                    if (i==0){
                        loggerService.addLogger(money.getUid(),"完成了一次交易");
                        conn.commit();
                        //添加日志
                        //清空缓存
                        UtilsCache.setBillUtils();
                        UtilsCache.setMoneyUtils();
                        map.put("code",200);
                        map.put("msg","添加成功");
                    }
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
        return map;
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
