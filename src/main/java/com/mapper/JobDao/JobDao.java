package com.mapper.JobDao;

import com.pojo.Job;

import java.util.List;

/**
 *职位的增加、删除方法接口
 */
public interface JobDao {
    //添加职位
    Integer addJob(Job job);

    //删除职位
    Integer delete(Job job);
    //修改职位
    Integer updateJob(Job job);
    //查看职位
    List<Job> findJobAll(Job job);
}
