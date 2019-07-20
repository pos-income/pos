package com.config;

import com.mapper.ProductsDao;
import com.mapper.impl.*;
import com.pojo.*;

import java.util.List;

/**
 * 存储常用的查询结果的工具类
 */
public class UtilsCache {
    private static List<Products> productsUtils;
    private static List<Money> moneyUtils;
    private static List<Users> userUtils;
    private static List<Logger> LoggerUtils;
    private static List<Bill> BillUtils;
    private UtilsCache(){}

    /**
     * 传回所有Products的详细信息
     * @return
     */
    public static List<Products> getProductsUtils() {
        if (productsUtils == null){
            ProductsDao productsDao = new ProductsDaoImpl();
            productsUtils = productsDao.findProductsAll(null);
        }
        return productsUtils;
    }

    /**
     * 传回所有Money的详细信息
     * @return
     */
    public static List<Money> getMoneyUtils() {
        if (moneyUtils == null){
            MoneyDaoImpl moneyDao = new MoneyDaoImpl();
            moneyUtils = moneyDao.findMoneyAll(null);
        }
        return moneyUtils;
    }
    /**
     * 传回所有User的详细信息
     * @return
     */
    public static List<Users> getUserUtils() {
        if (userUtils == null){
            UserDaoImpl userDao = new UserDaoImpl();
            userUtils = userDao.findUserAll(null);
        }
        return userUtils;
    }
    /**
     * 传回所有Logger的详细信息
     * @return
     */
    public static List<Logger> getLoggerUtils() {
        if (LoggerUtils == null){
            LoggerDaoImpl loggerDao = new LoggerDaoImpl();
            LoggerUtils = loggerDao.findLoggerAll(null);
        }
        return LoggerUtils;
    }
    /**
     * 传回所有Bill的详细信息
     * @return
     */
    public static List<Bill> getBillUtils() {
        if (BillUtils == null){
            BillDaoImpl billDao = new BillDaoImpl();
            BillUtils = billDao.findBillAll(null);
        }
        return BillUtils;
    }

    /**
     * 将productsUtils的内容置空
     */
    public static void setProductsUtils() {
        productsUtils = null;
    }
    /**
     * 将moneyUtils的内容置空
     */
    public static void setMoneyUtils() {
        moneyUtils = null;
    }
    /**
     * 将userUtils的内容置空
     */
    public static void setUserUtils() {
       userUtils = null;
    }
    /**
     * 将LoggerUtils的内容置空
     */
    public static void setLoggerUtils() {
        LoggerUtils = null;
    }
    /**
     * 将BillUtils的内容置空
     */
    public static void setBillUtils() {
        BillUtils = null;
    }
}
