package com.ytc.model;

public class Problem3 {
    private Integer problemid3;

    private String problemname3;

    public Integer getProblemid3() {
        return problemid3;
    }

    public void setProblemid3(Integer problemid3) {
        this.problemid3 = problemid3;
    }

    public String getProblemname3() {
        return problemname3;
    }

    public void setProblemname3(String problemname3) {
        this.problemname3 = problemname3 == null ? null : problemname3.trim();
    }
}