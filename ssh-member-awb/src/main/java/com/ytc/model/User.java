package com.ytc.model;

public class User {
    private Integer userid;

    private String username;

    private String userpwd;

    private Problem1 problem1;

    private String useranswerone;

    private Problem2 problem2;

    private String useranswertwo;

    private Problem3 problem3;

    private String useranswerthree;

    private String userimgone;

    private String userimgtwo;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }


    public String getUseranswerone() {
        return useranswerone;
    }

    public void setUseranswerone(String useranswerone) {
        this.useranswerone = useranswerone == null ? null : useranswerone.trim();
    }



    public String getUseranswertwo() {
        return useranswertwo;
    }

    public void setUseranswertwo(String useranswertwo) {
        this.useranswertwo = useranswertwo == null ? null : useranswertwo.trim();
    }

    public Problem1 getProblem1() {
        return problem1;
    }

    public void setProblem1(Problem1 problem1) {
        this.problem1 = problem1;
    }

    public Problem2 getProblem2() {
        return problem2;
    }

    public void setProblem2(Problem2 problem2) {
        this.problem2 = problem2;
    }

    public Problem3 getProblem3() {
        return problem3;
    }

    public void setProblem3(Problem3 problem3) {
        this.problem3 = problem3;
    }

    public String getUseranswerthree() {
        return useranswerthree;
    }

    public void setUseranswerthree(String useranswerthree) {
        this.useranswerthree = useranswerthree == null ? null : useranswerthree.trim();
    }

    public String getUserimgone() {
        return userimgone;
    }

    public void setUserimgone(String userimgone) {
        this.userimgone = userimgone == null ? null : userimgone.trim();
    }

    public String getUserimgtwo() {
        return userimgtwo;
    }

    public void setUserimgtwo(String userimgtwo) {
        this.userimgtwo = userimgtwo == null ? null : userimgtwo.trim();
    }
}