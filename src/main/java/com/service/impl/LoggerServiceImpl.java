package com.service.impl;

import com.mapper.LoggerDao;
import com.mapper.impl.LoggerDaoImpl;
import com.pojo.Logger;
import com.service.LoggerService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class LoggerServiceImpl implements LoggerService {
    private LoggerDao loggerDao = new LoggerDaoImpl();//获取持久层Logger对象
    @Override
    public void addLogger(Integer uid, String msg) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
        Logger logger = new Logger(null,uid,format,msg);
        loggerDao.addLogger(logger);
    }

    @Override
    public Map<String, Object> addLoggerService(Logger logger) {
        return null;
    }

    @Override
    public Map<String, Object> findLoggerService(Logger logger) {
        return null;
    }

    @Override
    public Map<String, Object> findLoggerAllService(Logger logger) {
        return null;
    }
}
