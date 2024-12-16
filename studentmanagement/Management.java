package com.zhuyishag.javase.studentmanagement;

//import java.util.Random;

import java.util.Scanner;
/**
 * @author Arczys
 * 学生管理系统
 *    1.创建数组存储学生信息 
 *    
 *    1.程序启动时，读取一个预设的学生数组，其中已经保存了学生信息（包括学生姓名、学号、出生日期、性别、联系方式
等）。
2.程序提供以下操作选项：
-显示所有学生的信息
-通过学号查找学生的信息
-添加新的学生信息
- 修改学生信息
- 删除学生信息
-退出程序
3.添加新的学生信息时，要求输入学生所有信息，并自动添加到学生数组中，学号自动生成，不能与已有学生的学号重复。
4.修改学生信息时，提示用户输入要修改的学生的学号，然后允许用户修改该学生的信息（包括姓名、出生日期、性别、
联系方式等)。
5.删除学生信息时，提示用户输入要删除的学生的学号，并将该学生从学生数组中删除。
6.修改、添加和删除学生信息后，重新显示所有学生的信息。

private String name;
	
	private int StudentNo;
	
	private String birth;
	
	private boolean sex;
	
	private long telegram;

 */

public class Management {
	
	private Student[][] students = new Student[3][1];
		
	private  int a = 2024010;
	public Management(){
		
		//初始化学生管理系统，先弄一个学生
	       int a = 2024010;
		 // Random random = new Random();
		for (int i = 0; i < students.length; i++) {
			for (int j = 0;j < students[i].length; j ++ ) {
				if(i == 0) {
				students[0][j] = new Student("张三",((a * 10) + (i + 1)),"2005.9.2",true,15201523321L);
				return;
				}
			}
		}
	}
	
	/**
	 * 添加新学生
	 */
	public void addStudent(String name,int studentNo,String birth,boolean sex,long telegram,int b) {
		
		for (int i = 0; i < students.length; i++) {
			for (int j = 0;j < students[i].length; j ++ ) {
				if(students[i][j] == null) {
					 b = i + 1;
					 System.out.println(b);
		 Scanner s = new Scanner(System.in);
		
		System.out.println("请输入名字");
		name = s.next();
		
		System.out.println("请输入出生年月日，例如：xxxx.xx.xx");
		birth = s.next();
		
		System.out.println("请输入性别，true为男  false为女");
		sex = s.nextBoolean();
		
		System.out.println("请输入电话");
	    telegram = s.nextLong();
		studentNo = a * 10 + b;
	    
		students[b - 1][0] = new Student(name,studentNo,birth,sex,telegram);
		
		   return;
				}
			}
		}
		
		
		//students[b][0].setBirth(birth);
		
		//students[b][0].setSex(sex);
	  
	    //students[b][0].setStudentNo(a * 10 + b);
	    
	    //students[b][0].setTelegram(telegram);
	   
	}
	
	
	/**
	 * 修改学生信息
	 */
	public void changeMessage(int num,int studentNo) {
		 Scanner s = new Scanner(System.in);
		
		 /*
		 for(int q = 1; q <= 5; q ++) {
			  if(num != q) {
			 System.out.println("您输入的数字不合法");
			 return;
		 }else {
		 */
			// for(int e = 1; e <= 4; e++) {
		    	  if(num != 5) {
		    		  /*
		  		
		  		*/
		    	System.out.println("请输入学号");
		    		 studentNo = s.nextInt(); 
		    		 
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				//
				if(i == studentNo - (a * 10) - 1) {
				System.out.println("输入1修改名字");
		  		System.out.println("输入2修改生日");
		  		System.out.println("输入3修改性别");
		  		System.out.println("输入4修改电话");
		  		System.out.println("输入5退出修改程序");
		  		while(true) {
		  		     num = s.nextInt();
					if(num == 1) {
						System.out.println("请输入修改后的名字");
						String name = s.next();
				students[i][0].setName(name);
					
					}else if(num == 2) {
						System.out.println("请输入修改后的出生年月日例如xxxx.xx.xx");
						String birth = s.next();
				students[i][0].setBirth(birth);
					
					}else if(num == 3) {
						System.out.println("请输入修改后的年龄");
						boolean sex = s.nextBoolean();
				students[i][0].setSex(sex);
					
					}else if(num == 4) {
						System.out.println("请输入修改后的联系方式");
						long tele = s.nextLong();
				students[i][0].setTelegram(tele);
					 
					}else if(num == 5) {
		    		  System.out.println("已退出修改程序");
		    		  return;
		    	  }
		  		}	
		  		
				//System.out.println(students[studentNo - (a * 10) - 1][0]);
				
				}
			}
		}
		    	  }	    	 
		     // }
		 //}
		 }
		 
		      

	
	
	/**
	 * 删除学生
	 */
	public void deleteStudent(int studentNo) {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				if(i == studentNo - (a * 10) - 1) {
				students[studentNo - (a * 10) - 1][0] = null;
				//System.out.println(students[studentNo - (a * 10) - 1][0]);
				return;
				}
			}
		}
	}
	
	
	/**
	 * 显示学生信息
	 */
	public void display() {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				System.out.println(students[i][j]);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 通过学号查找学生信息
	 */
	public void findMessage(int studentNo) {
		System.out.println(students[studentNo - (a * 10) - 1][0]);
	}
}






























































