package ch03.for10;

import java.util.Scanner;

public class Resolve13 {

	public static void main(String[] args) {
		// 양의 정수 입력받고 그 수만큼 3의 배수 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int num1 = sc.nextInt();
			for(int j=1;j<=num1;j++) {
				System.out.println(j*3);
			}

	}

}
