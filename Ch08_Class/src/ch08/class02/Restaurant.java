package ch08.class02;

import java.util.Scanner;


public class Restaurant {
	// 필드
	public String name;
	public Scanner sc;
	private String[] foods = {"냉면", "떡볶이", "쌀국수",
							"칼국수", "순대", "튀김", "라면"};
	private int selectNum;	
	
	// 메서드
	public void viewMenu() {
		System.out.println("---[" + name + "]---");
		for(int i=0;i<foods.length;i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	public void selectFood() {
		System.out.println("---[" + name + "]---");
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		System.out.println("---[" + name + "]---");
		String food = foods[selectNum];
		System.out.println(food + "이 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}
	
}
















