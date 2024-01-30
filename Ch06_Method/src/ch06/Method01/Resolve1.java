package ch06.Method01;

import java.util.Scanner;

public class Resolve1 {
	
	public static void maximum(int num, int num0) {
		int result = 0;
		if(num>num0)
			result = num;
		else
			result = num0;
		System.out.println("최대값은 " + result);
		
	}
	
		
	
	public static void minimum(int num, int num0) {
		int result = 0;
		if(num<num0)
			result = num;
		else
			result = num0;
		System.out.println("최소값은 " + result);
	}
	
	public static void main(String[] args) {
//		2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//		작은 값을 반환하는 메서드를 작성하고 사용하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하시오.");
		int num=sc.nextInt();
		System.out.println("두번째 정수를 입력하시오.");
		int num0=sc.nextInt();
		maximum(num,num0);
		minimum(num,num0);
		
		
		
		sc.close();

	}

}
