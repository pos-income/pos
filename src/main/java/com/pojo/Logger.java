package com.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
/**
 * 日志表
 */
public class Logger extends Users{
    //日志编号
    private Integer Id;
    //职员编号
    private Integer Uid;
    //添加时间
    private  String Time;
    //用户行为
    private String Play;

    public void setId(Integer id) {
        Id = id;
    }

    public void setUid(Integer uid) {
        Uid = uid;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setPlay(String play) {
        Play = play;
    }

    public Integer getId() {
        return Id;
    }

    public Integer getUid() {
        return Uid;
    }

    public String getTime() {
        return Time;
    }

    public String getPlay() {
        return Play;
    }
}
