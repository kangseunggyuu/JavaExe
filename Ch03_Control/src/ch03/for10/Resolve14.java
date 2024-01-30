package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

	public static void main(String[] args) {
		// 입력받은 숫자의 구구단을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int num1 = sc.nextInt();
			for(int j=1;j<=9;j++) {
				System.out.println(num1+"*"+j+"="+(num1*j));
			}

	}

}
