package com.itheima.classroomsystem;

public class Student {
    //id 名字 密码
    private String id;
    private String name;
    private String password;

    public Student(){
    }

    public Student(String id,String name,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword(){
        return password;
    }
}
