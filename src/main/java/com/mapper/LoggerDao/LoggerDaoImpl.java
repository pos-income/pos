package com.mapper.LoggerDao;

import com.config.JdbcTemplate;
import com.mapper.LoggerDao.LoggerDao;
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
        Integer addLoggerMethed = JdbcTemplate.update(null,"insert into logger (Uid,Time,Play) value(?,?,?)",
                logger.getUid(), logger.getTime(), logger.getPlay());
        return addLoggerMethed;
    }

    /**
     *通过Time查询所有日志信息
     * @param logger
     * @return
     */
    @Override
    public List<Logger> findLoggerAll(Logger logger) {
        List<Logger> findLoggerAllMethed = jdbcTemplate.query("select * from logger order by Time",
                new Logger(),null);
            if (findLoggerAllMethed!=null){
                if (findLoggerAllMethed.size()>0){
                    return findLoggerAllMethed;
                }
            }
            return null;
    }
}
