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
        Integer update = JdbcTemplate.update("insert into logger (Uid,Time,Play) value(?,?,?)",
                logger.getUid(), logger.getTime(), logger.getPlay());
        return update;
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
        List<Logger> queryAll = jdbcTemplate.query("select * from logger",
                logger.getTime());
        return queryAll;
    }
}
