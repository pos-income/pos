package com;

import com.config.JdbcTemplate;
import com.config.JdbcUtils;
import com.pojo.Job;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

public  class Test001 {
    public static void main(String[] args) {
        Job job = new Job();
        //JdbcTemplate.update("insert into job (Jname) value(1232)");
        JdbcTemplate.query("select * from job",job);

    }
}
