package ch06.Method01;

import java.util.Scanner;

public class Resolve5 {
	
	public static void star(int num) {
			for(int i=1;i<=num;i++) {  //세로열
			for(int j=1;j<=i;j++) {  //가로열
				System.out.print('*');
			}
			System.out.println();
		}
			return;
	}
		
	public static void main(String[] args) {
//		star(5);
//		을 입력하면 
//		*
//		**
//		***
//		****
//		*****
//		위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		int num = sc.nextInt();
		star(num);
		
		
		sc.close();

	}

}
