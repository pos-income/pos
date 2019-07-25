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
   // private Integer Id;
    //入职时间
   // private String Time;
    //收入（找零前）
    private BigDecimal Income;
    //找零
    private BigDecimal Outcome;
    //剩余收入（找零后）
    private BigDecimal residue;
    //职员id
    private Integer uid;
    //账号id
    private String Bid;



    public void setIncome(BigDecimal income) {
        Income = income;
    }

    public void setOutcome(BigDecimal outcome) {
        Outcome = outcome;
    }

    public void setResidue(BigDecimal residue) {
        this.residue = residue;
    }

    public void setUid(Integer uid) {
        uid = uid;
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
        return uid;
    }

    public String getBid() {
        return Bid;
    }


    @Override
    public String toString() {
        return "Money{" +
                "Income=" + Income +
                ", Outcome=" + Outcome +
                ", residue=" + residue +
                ", Uid=" + uid +
                ", Bid='" + Bid + '\'' +
                "} " ;
    }
}
