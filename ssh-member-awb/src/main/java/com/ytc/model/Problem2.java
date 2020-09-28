package com.ytc.model;

  public class Problem2 {
    private Integer problemid2;

    private String problemname2;

    public Integer getProblemid2() {
        return problemid2;
    }

    public void setProblemid2(Integer problemid2) {
        this.problemid2 = problemid2;
    }

    public String getProblemname2() {
        return problemname2;
    }

    public void setProblemname2(String problemname2) {
        this.problemname2 = problemname2 == null ? null : problemname2.trim();
    }
}