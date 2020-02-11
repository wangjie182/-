package com.csdn;

public class Room {
	
	private String no;
	private int isBooked;  // 0 未入住 1 已入住
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getIsBooked() {
		return isBooked;
	}
	public void setIsBooked(int isBooked) {
		this.isBooked = isBooked;
	}
	public Room(String no, int isBooked) {
		super();
		this.no = no;
		this.isBooked = isBooked;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.no + "," + (this.isBooked==1 ? "有人" : "空房");
	}
}
