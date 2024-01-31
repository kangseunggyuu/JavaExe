package ch08.class09;

import java.util.Scanner;

public class ChinaRest {
	public String[] foods = {"짜장면", "짬뽕", "차돌짬뽕", "탕수육", "볶음밥"};
	public int SelectNum;
	
	public Scanner sc = new Scanner(System.in);
	
	public void ViewMenu() {
		for(int i=0; i<foods.length; i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	
	public void SelectMenu() {
		System.out.print("메뉴를 선택해주세요. >> ");
		SelectNum = sc.nextInt();
	}
	
	public void DeliveryFoods() {
		String food = foods[SelectNum];
		System.out.println("주문하신 " + food + " 나왔습니다.");
		System.out.println("식마쇼.");
	}
	
	public void KeyboardOut() {
		sc.close();
	}

}
