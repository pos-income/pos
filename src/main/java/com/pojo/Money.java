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
    private Integer Id;
    //入职时间
    private String Time;
    //收入（找零前）
    private BigDecimal Income;
    //找零
    private BigDecimal Outcome;
    //剩余收入（找零后）
    private BigDecimal residue;
    //职员id
    private Integer Uid;
    //账号id
    private String Bid;

    @Override
    public void setId(Integer id) {
        Id = id;
    }

    @Override
    public void setTime(String time) {
        Time = time;
    }

    @Override
    public Integer getId() {
        return Id;
    }

    @Override
    public String getTime() {
        return Time;
    }

    public void setIncome(BigDecimal income) {
        Income = income;
    }

    public void setOutcome(BigDecimal outcome) {
        Outcome = outcome;
    }

    public void setResidue(BigDecimal residue) {
        this.residue = residue;
    }

    public void setUid(Integer Uid) {
        this.Uid = Uid;
    }

    public void setBid(String bid) {
        Bid = bid;
    }


    public BigDecimal getIncome() {
        return Income;
    }

    public BigDecimal getOutcome() {
        return Outcome;
    }

    public BigDecimal getResidue() {
        return residue;
    }

    public Integer getUid() {
        return Uid;
    }

    public String getBid() {
        return Bid;
    }

    @Override
    public String toString() {
        return "Money{" +
                "Id=" + Id +
                ", Time='" + Time + '\'' +
                ", Income=" + Income +
                ", Outcome=" + Outcome +
                ", residue=" + residue +
                ", Uid=" + Uid +
                ", Bid='" + Bid + '\'' +
                "} " ;
    }
}
