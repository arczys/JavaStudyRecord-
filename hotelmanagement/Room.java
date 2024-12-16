package com.zhuyishag.javase.hotelmanagement;

/**
 * 酒店的房间
 * @author 朱亦商
 * @since 2024.11.25
 */
public class Room {
	/*
	 * 房间编号：
	 * 101.......................110
	 * 201.......................210
	 * 301.......................310
	 * 401.......................410
	 * 501.......................510
	 * 601.......................610
	 * */
	private int roomNo;
	
	/*
	 * 房间类型：
	 * 单人间
	 * 标准间
	 * 豪华间
	 * */
	private String type;
	
	/*
	 * 状态：
	 * true表示占用 ，false表示空闲
	 * */
	private boolean state;

	
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Room(int roomNo, String type, boolean state) {
		super();
		this.roomNo = roomNo;
		this.type = type;
		this.state = state;
	}

	
	
	/**
	 * @return the roomNo
	 */
	public int getRoomNo() {
		return roomNo;
	}

	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return"["+this.roomNo+","+this.type+","+(this.state ? "占用" : "空闲")+"]";
	}
	
	
	
}
