package com.csdn;

import java.util.Scanner;

public class Test {

		public static void main(String[] args) {
			String menu = "请选择 ： \n1: 入住\n2: 退房\n3: 查房\n4: 退出系统";
			HotelManage hm = new HotelManage();
			hm.initRoom();
			System.out.println(menu);
			Scanner s = new Scanner(System.in);
			while (true) {
			  if (s.hasNext()) {
				int choice = s.nextInt();
				switch (choice) {
				case 1:
					System.out.println("请输入入住房间号");
					Scanner s1 = new Scanner(System.in);
					if (s1.hasNext()) {
						String no = s1.next();
						hm.checkIn(no);
						System.out.println("入住成功！");
					}
					break;

				case 2:
					System.out.println("请输入退房房间号");
					Scanner s2 = new Scanner(System.in);
					if (s2.hasNext()) {
						String no = s2.next();
						hm.checkOut(no);
						System.out.println("退房成功！");
					}
					break;
				case 3:
					hm.show();
					break;
				case 4:
					System.out.println("bye bye!");
					System.exit(0);
					break;
				default:
					break;
			}
			}
		}
}}
