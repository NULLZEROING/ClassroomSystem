package com.itheima.classroomsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSyetem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            System.out.println("欢迎进入课室管理系统");
            System.out.println("1：登录");
            System.out.println("2：注册");
            System.out.println("3：退出");
            System.out.println("输入选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1"-> login(list);
                case "2"-> signin(list);
                case "3"-> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");

            }
        }
    }

    //登录系统
    public static void login(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入id");
            String id= sc.next();

            System.out.println("请输入密码");
            String password= sc.next();

            boolean flag3=contains(id,password);
            if (flag3){
                //跳转管理员界面
            }

            boolean flag2=contains(list,id,password);
            if (flag2){
                //跳转课室界面
            }else {
                System.out.println("用户不存在或密码错误");
            }
        }
    }
    //注册系统
    public static void signin(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入id：");
            id = sc.next();

            boolean flag1=contains(list,id);
            if (flag1){
                System.out.println("id已经存在，请重新录入");
            }else {
                break;
            }
        }

        System.out.println("请输入姓名：");
        String name = sc.next();

        System.out.println("请输入密码：");
        String password = sc.next();

        Student s = new Student(id,name,password);



        list.add(s);

        System.out.println("添加成功");

    }

    //id唯一检查
    public static boolean contains(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student student=list.get(i);//获取名单内id
            String sid=student.getId();
            if (sid.equals(id)){
                return true;//对比，已有返回true，没有返回false
            }
        }
        return false;
    }

    //登录正确检查
    public static boolean contains(ArrayList<Student> list,String id,String password){
        for (int i = 0; i < list.size(); i++) {
            Student student=list.get(i);
            String sid=student.getId();
            String sp=student.getPassword();
            if (sid.equals(id)&&sp.equals(password)){
                return true;
            }
        }
        return false;
    }

    //管理员登录检测
    public static boolean contains(String id,String password){
        String gmid="null";
        String gmpassword="origin";
            if (gmid.equals(id)&&gmpassword.equals(password)){
                return true;
            }
            return false;
    }
}
