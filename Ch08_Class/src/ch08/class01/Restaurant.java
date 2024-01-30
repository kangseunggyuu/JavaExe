package ch08.class01;

import java.util.Scanner;

/* 클래스는 영역이 확실하다(클래스의 캡슐화)
 * 클래스 = 멤버변수(필드) + 멤버함수(메서드)
 * 
 * 식당
 * 필드=변수=명사
 * 메서드=함수=동사
 * 
 * [클래스의 대상]
 * 큰 개념의 명사(일반적인 클래스)
 * 동사들의 집합(Controller, Business Layer)
 * 필드들의 집합(Vo, Dto)
 * */
public class Restaurant {
	// 필드
	private String[] foods = {"냉면", "떡볶이", "쌀국수",
							"칼국수", "순대", "튀김", "라면"};
	private int selectNum;
	private Scanner sc = new Scanner(System.in);
	
	// 메서드
	public void viewMenu() {
		for(int i=0;i<foods.length;i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	public void selectFood() {
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		String food = foods[selectNum];
		System.out.println(food + "이 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}
	public void keyboardEnd() {
		sc.close();
	}
	
}
















