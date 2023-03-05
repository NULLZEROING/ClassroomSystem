package com.itheima.classroomsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomSystem {
    public static void main(String[] args) {
        ArrayList<Classroom> list = new ArrayList<>();
        loop:while (true) {
            System.out.println("欢迎进入课室管理系统");
            System.out.println("1：查看课室");
            System.out.println("2：申请课室");
            System.out.println("3：退出");
            System.out.println("输入选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1"-> checkclassroom(list);
                case "2"-> applyclassroom(list);
                case "3"-> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");

            }
        }
    }


    public static void checkclassroom(ArrayList<Classroom> list) {
        System.out.println("教室编号\t\t状态\t申请");
        for (int i = 0;i < list.size();i++){
            Classroom classroom = list.get(i);
            System.out.println(classroom.getNumber()+"\t"+classroom.getState()+"\t"+classroom.getApply());
        }
    }

    public static void applyclassroom(ArrayList<Classroom> list) {
        System.out.println();

    }

}
