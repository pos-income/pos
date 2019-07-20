package com.mapper.impl;

import com.config.JdbcTemplate;
import com.mapper.JobDao;
import com.pojo.Job;

import java.util.List;

public class JobDaoImpl implements JobDao {
    /**
     *添加职业信息
     * @param job
     * @return
     */
    @Override
    public Integer addJob(Job job) {
        Integer update = JdbcTemplate.update("insert into job (Jname) value(?)",
                job.getJname());
        return update;
    }

   /* @Override
    public Job findJob(Job job) {
        return null;
    }

    @Override
    public List<Job> findJobAll(Job job) {
        return null;
    }*/
}
