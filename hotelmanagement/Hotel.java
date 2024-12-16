package com.zhuyishag.javase.hotelmanagement;

/**
 * @author Arczys
 *酒店管理系统
 *  1.创建数组存储酒店房间信息
 *  2.运用System.in 接受数字完成相对应操作（控制语句）
 *  3.数组的增，删，改操作
 *  4.注意完善逻辑 
 */

public class Hotel {
	/*
	 * 酒店当中所有的房间
	 * */
	private Room[][] rooms = new Room[6][10];
	
	
	/*
	 * 构造方法，通过该方法可以盖一个酒店出来
	 * */
	public Hotel() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if(i == 0 || i == 1) {
					rooms[i][j] = new Room(((i + 1) * 100 + j + 1),"单人间",false);
				}else if(i == 2 || i == 3) {
					rooms[i][j] = new Room(((i + 1) * 100 + j + 1),"标准间",false);
				}else if(i == 4 || i ==5) {
					rooms[i][j] = new Room(((i + 1) * 100 + j + 1),"豪华间",false);
				}
			}
		}
	}
	
	/**预定房间
	 * @param roomNo 房间编号
	 */
	public void order(int roomNo) {
		//101
		//i = 0  
		//j = 0
		rooms[roomNo / 100 - 1][roomNo % 100 - 1].setState(true);
	}
	
	/**退房
	 * @param roomNo
	 */
	public void exit(int roomNo) {
		rooms[roomNo / 100 - 1][roomNo % 100 - 1].setState(false);
	}
	
	/**
	 * 显示房间的所有状态
	 */
	public void display() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j]);
			}
			System.out.println();
		}
	}
}































































































































