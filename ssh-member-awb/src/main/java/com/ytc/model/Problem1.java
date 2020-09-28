package com.ytc.model;

public class Problem1 {
    private Integer problemid1;

    private String problemname;

    public Integer getProblemid1() {
        return problemid1;
    }

    public void setProblemid1(Integer problemid1) {
        this.problemid1 = problemid1;
    }

    public String getProblemname() {
        return problemname;
    }

    public void setProblemname(String problemname) {
        this.problemname = problemname == null ? null : problemname.trim();
    }

    @Override
    public String toString() {
        return "Problem1{" +
                "problemid1=" + problemid1 +
                ", problemname='" + problemname + '\'' +
                '}';
    }
}