package com.service;

import com.pojo.Logger;

import java.util.Map;

public interface LoggerService {
    Map<String,Object> addLoggerService(Logger logger);

    Map<String,Object> findLoggerService(Logger logger);

    Map<String,Object> findLoggerAllService(Logger logger);

}
