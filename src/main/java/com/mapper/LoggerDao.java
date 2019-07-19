package com.mapper;

import com.pojo.Logger;

import java.util.List;

/**
 *
 */
public interface LoggerDao {

    Integer addLogger(Logger logger);

    Logger findLogger(Logger logger);

    List<Logger> findLoggerAll(Logger logger);
}
