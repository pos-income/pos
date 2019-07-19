package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 职位表
 */
public class Job {
    //职位编号
    private Integer Id;
    //职位名称
    private String Jname;

    public void setId(Integer id) {
        Id = id;
    }

    public void setJname(String jname) {
        Jname = jname;
    }

    public Integer getId() {
        return Id;
    }

    public String getJname() {
        return Jname;
    }
}
