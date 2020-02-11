package com.csdn;

import java.util.ArrayList;

public class HotelManage {

	
	ArrayList<Room> roomList = new ArrayList<Room>();
	public void initRoom() {
		Room r1 = new Room("101",0);
		Room r2 = new Room("102",0);
		Room r3 = new Room("201",0);
		Room r4 = new Room("202",0);
		
		roomList.add(r1);
		roomList.add(r2);
		roomList.add(r3);
		roomList.add(r4);

	}
	

	public void checkIn(String roomNo) {
		for (Room room : roomList) {
			if (room.getNo().equals(roomNo)) {
				room.setIsBooked(1);
				break;
			}
		}
	}
	
	public void checkOut(String roomNo) {
		for (Room room : roomList) {
			if (room.getNo().equals(roomNo)) {
				room.setIsBooked(0);
				break;
			}
		}
	}

	public void show() {
		for (Room room : roomList) {
			System.out.println(room);
		}
	}
}


