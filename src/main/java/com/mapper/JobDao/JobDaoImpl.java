package com.mapper.JobDao;

import com.config.JdbcTemplate;
import com.pojo.Job;

import java.util.List;

public class JobDaoImpl implements JobDao {

    JdbcTemplate jdbcTemplate=new JdbcTemplate();
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
     *通过id删除职位
     * @param job
     * @return
     */
    @Override
    public Integer delete(Job job) {
        Integer deleteJobMethed = JdbcTemplate.update(null,"delete from job where Id=?",
                job.getId());
        return deleteJobMethed;
    }

    /**
     * 通过ID修改
     * @param job
     * @return
     */
    @Override
    public Integer updateJob(Job job) {
        Integer updateJobMethed = JdbcTemplate.update(null, "update job set Jname=? where Id=?",
                job.getJname(), job.getId());
        return updateJobMethed;
    }

   /* @Override
    public Job findJob(Job job) {
        return null;
    }*/

    /**
     * 查看所有职位
     * @param job
     * @return
     */
    @Override
    public List<Job> findJobAll(Job job) {
        jdbcTemplate.query("select * from job",
                new Job(),null);
        return null;
    }
}
