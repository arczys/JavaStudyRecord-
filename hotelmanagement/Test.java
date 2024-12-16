package com.zhuyishag.javase.hotelmanagement;

import java.util.Scanner;
/**
 *酒店前台使用的 
 */
public class Test {
	public static void main(String[] args) {
		//创建Hotel
		Hotel hotel = new Hotel();
		
		System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用哦个说明");
		System.out.println("请通过选择对应的功能编号来使用对应的功能：");
		
		Scanner s = new Scanner(System.in);
		
		 while(true) {
		System.out.println("【1】查看酒店所有房间状态");
		System.out.println("【2】预定房间");
		System.out.println("【3】退出房间");
		System.out.println("【0】退出系统");
		System.out.println("请输入功能编号");
			 //获取功能编号
		 int no = s.nextInt();
		 switch(no) {
		 	
		 case 1 -> hotel.display();
		 	
		 case 2 -> {System.out.println("请输入预定的房间号 ");
		 	int roomNo = s.nextInt();
		 	hotel.order(roomNo);
			System.out.println("预定房间【"+roomNo+"】成功");
		 		}
		 	
		 case 3 -> {System.out.println("请输入退房的房间号 ");
		 	int roomNo = s.nextInt();
		 	hotel.exit(roomNo);
		 	System.out.println("退出房间【"+roomNo+"】成功");
		 		}
		 	
		 case 0 ->{
		 		System.out.println("再见欢迎下次使用");
		 		//退出系统，终止JVM/return
		 		System.exit(0);
		 		}
		 	}
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
