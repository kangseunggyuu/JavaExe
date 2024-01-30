package ch08.class07;

import java.util.Scanner;


public class Restaurant {
	// 필드
	private String[] foods;
	private int selectNum;
	private Scanner sc;
	private String name;
	
	/* 생성자 함수(메서드)
	 * 1) 클래스 이름과 동일
	 * 2) return 형이 없다.
	 * 3) 객체 생성되면 자동으로 가장 먼저 호출된다.
	 * 4) 객체의 자동 초기화 작업
	 * 5) 필드변수의 초기화 작업
	 * */
	/* this는 객체 자신을 의미하며
	 * 객체 자신의 필드를 가리킬 때 사용한다.
	 * */
	public Restaurant(Scanner sc, String name, String[] foods) {
		this.sc = sc;
		this.name = name;
		this.foods = foods;
		
		// 객체가 생성되고 자동으로 처리해야 하는 작업을 코딩
		System.out.println(this.name + " 식당을 청소한다~");
	}
	
	// 메서드
	public void viewMenu() {
		System.out.println("-----[" + this.name + "]-----");
		for(int i=0;i<foods.length;i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	public void selectFood() {
		System.out.println("-----[" + this.name + "]-----");
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		System.out.println("-----[" + this.name + "]-----");
		String food = foods[selectNum];
		System.out.println(food + "이 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}
	
}
















