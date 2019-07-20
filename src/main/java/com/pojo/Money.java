package com.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@NoArgsConstructor
@AllArgsConstructor
/**
 * 资金类
 */
public class Money extends Users{
    //资金的id
    private Integer id;
    //入职时间
    private String Time;
    //收入（找零前）
    private Double Income;
    //找零
    private Double Outcome;
    //剩余收入（找零后）
    private Double residue;
    //职员id
    private Integer Uid;
    //账号id
    private String Bid;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setIncome(Double income) {
        Income = income;
    }

    public void setOutcome(Double outcome) {
        Outcome = outcome;
    }

    public void setResidue(Double residue) {
        this.residue = residue;
    }

    public void setUid(Integer uid) {
        Uid = uid;
    }

    public void setBid(String bid) {
        Bid = bid;
    }

    public Integer getId() {
        return id;
    }

    public String getTime() {
        return Time;
    }

    public Double getIncome() {
        return Income;
    }

    public Double getOutcome() {
        return Outcome;
    }

    public Double getResidue() {
        return residue;
    }

    public Integer getUid() {
        return Uid;
    }

    public String getBid() {
        return Bid;
    }
}
