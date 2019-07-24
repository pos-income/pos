package com.service.impl;

import com.config.UtilsCache;
import com.mapper.LoggerDao;
import com.mapper.impl.LoggerDaoImpl;
import com.pojo.Logger;
import com.pojo.Products;
import com.service.LoggerService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
    public Map<String, Object> findLoggerAllService(Integer page) {
        Map<String, Object> map = new HashMap<>();
        List<Logger> loggers = UtilsCache.getLoggerUtils();
        if (page==null){
            page = 1;
        }
        Integer start = 5*(page-1);//起始下标
        Integer end;//结束下标
        if (loggers.size()>start){
            if (loggers.size()-start>=5){
                end = start+5;
            }else {
                end = loggers.size();
            }
            map.put("userList",loggers.subList(start,end));
            map.put("count",loggers.size());
        }else{
            map.put("code",-5);
            map.put("msg","没有更多日志");
        }
        return map;
    }
}
