package com.mapper.LoggerDao;

import com.pojo.Logger;

import java.util.List;

/**
 *日志的增加、查找方法接口
 */
public interface LoggerDao {

    Integer addLogger(Logger logger);

   /* Logger findLogger(Logger logger);*/

    List<Logger> findLoggerAll(Logger logger);
}
