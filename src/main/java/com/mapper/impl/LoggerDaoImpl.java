package com.mapper.impl;

import com.config.JdbcTemplate;
import com.mapper.LoggerDao;
import com.pojo.Logger;

import java.util.List;

public class LoggerDaoImpl implements LoggerDao {
    //
    JdbcTemplate<Logger> jdbcTemplate =new JdbcTemplate<>();

    /**
     *添加日志信息
     * @param logger
     * @return
     */
    @Override
    public Integer addLogger(Logger logger) {
        Integer addLoggerMethed = JdbcTemplate.update("insert into logger (Uid,Time,Play) value(?,?,?)",
                logger.getUid(), logger.getTime(), logger.getPlay());
        return addLoggerMethed;
    }

   /* @Override
    public Logger findLogger(Logger logger) {
        return null;
    }*/

    /**
     *通过Time查询所有日志信息
     * @param logger
     * @return
     */
    @Override
    public List<Logger> findLoggerAll(Logger logger) {
        List<Logger> findLoggerAllMethed = jdbcTemplate.query("select * from logger",
                new Logger());
        return findLoggerAllMethed;
    }
}
