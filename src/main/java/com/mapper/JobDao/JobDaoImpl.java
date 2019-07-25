package com.mapper.JobDao;

import com.config.JdbcTemplate;
import com.mapper.JobDao.JobDao;
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
        Integer addJobMethed = JdbcTemplate.update(null,"insert into job (Jname) value(?)",
                job.getJname());
        return addJobMethed;
    }

    /**
     *通过Jname删除职位
     * @param job
     * @return
     */
    @Override
    public Integer delete(Job job) {
        Integer deleteJobMethed = JdbcTemplate.update(null,"delete from job where Jname=?",
                job.getJname());
        return deleteJobMethed;
    }

   /* @Override
    public Job findJob(Job job) {
        return null;
    }*/

    @Override
    public List<Job> findJobAll(Job job) {
        return null;
    }
}
