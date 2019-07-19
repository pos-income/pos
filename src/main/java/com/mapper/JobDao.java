package com.mapper;

import com.pojo.Job;

import java.util.List;

/**
 *
 */
public interface JobDao {

    Integer addJob(Job job);

    Job findJob(Job job);

    List<Job> findJobAll(Job job);
}
