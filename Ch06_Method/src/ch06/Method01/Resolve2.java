package ch06.Method01;

import java.util.Scanner;

public class Resolve2 {

	public static int minus(int num, int num0) {
		int result = num-num0;
		return result;
	}
	
	public static void main(String[] args) {
//		두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//		사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//		절대값이 계산되어서 출력되어야 합니다.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력하시오.");
		int num = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오.");
		int num0 = sc.nextInt();
		int result = minus(num, num0);
		int result1 = Math.abs(result);
		System.out.println("결과값은: " + result);
		System.out.println("절대값은: " + result1);

		sc.close();

	}

}
