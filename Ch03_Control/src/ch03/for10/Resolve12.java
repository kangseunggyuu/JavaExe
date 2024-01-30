package ch03.for10;

import java.util.Scanner;

public class Resolve12 {

	public static void main(String[] args) {
		// 양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int num1 = sc.nextInt();
		String num2 = "감사합니다.";
		for(int i=1;i<=num1;i++) {
			if(i>=0) {
				System.out.println(num2);
			}
			
			sc.close();
			
		}

	}

}
