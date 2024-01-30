package ch06.Method01;

import java.util.Scanner;

public class MethodEx4 {
	// main 메서드 내의 계산하는 부분을 옮긴다.
	// public static 뒤에 오는 'int'부분은 결과값에 따라 정해진다.
	public static int calcArith(int num0, int num1, String op) {
		int result = 0;		// 결과값 저장 변수
		// void는 return에 해당되지 않음
		// 2) 계산을 하는 부분
		switch(op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		default:
			System.out.println("연산이 불가능합니다.");
			break;
		}
		
		// 이 함수를 호출한 곳으로 이 값을 가지고 돌아가
		return result;
		
	}
	
	public static void viewResult(int result) {
		// 3) 결과값 출력
		System.out.println("결과값은 " + result + "입니다.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1) 처리하기 전에 입력받는 부분
		System.out.print("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("연산자 입력(+ - * / %) >> ");
		String op = sc.next();
		
		int result = calcArith(num0, num1, op);
		viewResult(result);
		
		sc.close();
	}
}



