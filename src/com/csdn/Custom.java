package com.csdn;

public class Custom {
	
	private int cid;
	private String name;
	private Room room;
	private int days;
	public Custom(int cid, String name, Room room, int days) {
		super();
		this.cid = cid;
		this.name = name;
		this.room = room;
		this.days = days;
	}
	public Custom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
}
