package com.mapper;

import com.pojo.Job;

import java.util.List;

/**
 *职位的增加、查找方法接口
 */
public interface JobDao {

    Integer addJob(Job job);

    Job findJob(Job job);

    List<Job> findJobAll(Job job);
}
