package com.iss;

import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
	// write your code here
        System.out.println("   欢迎使用丰翼超市管理系统");
        System.out.println("************************");
        System.out.println("   1.登陆系统");
        System.out.println("   2.退出系统");
        System.out.println("************************");
        System.out.println("   请输入您的选择");

        //读入
        Scanner scanner =new Scanner(System.in);
        int in=scanner.nextInt();
//        System.out.println(in);
        if (in == 2) {
            System.out.println("退出系统");
        }else {
            System.out.println("   登陆系统");
            System.out.println("请输入用户名：");
            System.out.println("请输入密码：");
        }
        String name,psd;
        name=scanner.next();
        psd=scanner.next();




    }

}
