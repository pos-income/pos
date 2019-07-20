package com.pojo;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
/**
 * 职员类
 */
public class Users extends  Job{
//    员工账号，可以用作员工登录系统的账号
    private Integer Id;
//    员工的职位id，可根据该id知道该员工的职位
    private  Integer Jid;
//    员工的姓名
    private String UserName;
//    员工的系统登录密码
    private String Password;

    public Integer getJid() {
        return Jid;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getTime() {
        return Time;
    }

    //    员工的入职时间
    private String Time;
    //检测用户是否已经登录  0代表未登录 1代表登录
    private Integer IsLog;
    //检测用户是否在值，0代表离职 1代表在职
    private Integer Status;
    //检测应户名的邮箱
    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setJid(Integer jid) {
        Jid = jid;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setTime(String time) {
        Time = time;
    }
}
