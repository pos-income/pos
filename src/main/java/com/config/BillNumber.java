package com.config;

import java.util.Random;

/**
 * 生成账单编号
 */
public class BillNumber {

    public static String getNumber(){
        //获取时间戳(作为编号的前缀，确保其唯一，省去去数据库查询)，并转换为秒值；
        long l = System.currentTimeMillis()/1000;
        //将获取的秒数值转化为字符串格式，作为编号的前半部分；
        String numberPrefix = l + "";
        //生成随机数，作为订单编号的后缀；
        String sources = "0123456789abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder numberSuffix = new StringBuilder();
        for (int i = 0; i < 3; i++){
            numberSuffix.append(sources.charAt(random.nextInt(sources.length()))+"");
        }
        //将生成的前缀和后缀进行拼接，组成完整的订单编号；
        return numberPrefix+numberSuffix;
    }
}
