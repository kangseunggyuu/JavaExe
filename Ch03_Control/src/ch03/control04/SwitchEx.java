package ch03.control04;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		System.out.println("1. 짜장면");
		System.out.println("2. 짬뽕");
		System.out.println("3. 탕수육");
		System.out.println("4. 유산슬");
		System.out.println("5. 유린기");
		System.out.println("선택 >> ");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		switch(sel) {
		case 1:
			System.out.println("짜장면이 나왔습니다.");
			break;
		case 2:
			System.out.println("짬뽕이 나왔습니다.");
			break;
		case 3:
			System.out.println("탕수육이 나왔습니다.");
			break;
		case 4:
			System.out.println("유산슬이 나왔습니다.");
			break;
		case 5:
			System.out.println("유린기가 나왔습니다.");
			break;
		default: //else의 의미
			System.out.println("해당 메뉴 번호가 없습니다.");
			break;
		}
		
		sc.close();
		

	}

}
