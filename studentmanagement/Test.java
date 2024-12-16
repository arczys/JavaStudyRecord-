package com.zhuyishag.javase.studentmanagement;

import java.util.Scanner;
/**
 *学校的学生管理系统 
 */

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("欢迎使用学生管理系统");
		System.out.println("请输入以下数字进行相应的功能操作");
		System.out.println("0->退出该学生管理系统");
		System.out.println("1->查看系统内的学生信息");
		System.out.println("2->添加新的学生（包括其相应信息）");
		System.out.println("3->修改已有的学生信息");
		System.out.println("4->输入相应的学号并查看该学生的信息");
		System.out.println("5->删除系统内的学生");
		
		
		Management management = new Management();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
		
		int no = s.nextInt();
		
		switch(no) {
		case 1 -> management.display();
		case 2 -> management.addStudent("朱亦商",0,null, false, no,0);
		case 3 -> {
			/*
				  System.out.println("输入1修改名字");
				  System.out.println("输入2修改生日");
				  System.out.println("输入3修改性别");
				  System.out.println("输入4修改电话");
				  */
				 // int m = s.nextInt();
				  management.changeMessage(0,0);	
		}
		
		case 4 ->{
			     System.out.println("请输入学号");
		         int n = s.nextInt();
		         management.findMessage(n);
		        }
		case 5 ->{
				System.out.println("请输入学号");
				int studentNo = s.nextInt();
				management.deleteStudent(studentNo);
				System.out.println("学生信息已删除成功");
		}
		case 0 -> {
			System.out.println("欢迎下次使用");
			System.exit(0);
		}
			}
		}
	}
}































































