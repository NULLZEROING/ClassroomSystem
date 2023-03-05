package com.itheima.classroomsystem;

public class Classroom {
    //编号 状态 申请
    private String number;
    private String state;
    private String apply;

    public Classroom(){
    }

    public Classroom(String number,String state,String apply){
        this.number=number;
        this.state=state;
        this.apply=apply;
    }

    public String getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public String getApply(){
        return apply;
    }
}