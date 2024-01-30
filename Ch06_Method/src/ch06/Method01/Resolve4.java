package ch06.Method01;

import java.util.Scanner;

public class Resolve4 {
	
	public static int gugudan(int dan) {
		int result = dan;
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		return result;
	}
	
	public static void viewResult(int result) {
		System.out.println("원하시는 구구단 나왔습니다.");
	}
	
	public static void main(String[] args) {
//		gugudan(3);
//		구구단 메서드를 void 리턴형으로 제작하세요.
//		3을 입력하면 3단이 출력됩니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하시는 숫자를 입력하시오. >> ");
		int dan = sc.nextInt();
		int result = gugudan(dan);
		viewResult(result);
		
		sc.close();

	}

}
