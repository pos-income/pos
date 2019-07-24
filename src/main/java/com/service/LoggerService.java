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
//    Map<String,Object> addLoggerService(Logger logger);

    /**
     * 根据条件查询日志
     * @param logger
     * @return
     */
//    Map<String,Object> findLoggerService(Logger logger);

    /**
     * 查询所有日志信息
     * @param page 页码
     * @return
     */
    Map<String,Object> findLoggerAllService(Integer page);

}
