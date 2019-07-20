package com.service;

import com.pojo.Logger;

import java.util.Map;

public interface LoggerService {
    /**
     * 新增日志
     * @param uid 用户id
     * @param msg 用户行为
     */
    void addLogger(Integer uid,String msg);
    Map<String,Object> addLoggerService(Logger logger);

    Map<String,Object> findLoggerService(Logger logger);

    Map<String,Object> findLoggerAllService(Logger logger);

}
