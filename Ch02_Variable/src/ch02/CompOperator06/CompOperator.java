package ch02.CompOperator06;

import java.util.Scanner;

public class CompOperator {

	public static void main(String[] args) {
		boolean isLarge;
		int num0, num1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[대소 비교 연산]");
		System.out.println("1번째 숫자 입력");
		num0 = sc.nextInt();
		System.out.println("2번째 숫자 입력");
		num1 = sc.nextInt();
		
		isLarge = num0 > num1;
		System.out.println(num0 + "은 " + num1 + 
				"보다 크다는 사실은 " + isLarge + "입니다.");
		sc.close();

	}

}



