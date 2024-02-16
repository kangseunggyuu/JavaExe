package ch06.Method01;

public class Resolve3 {
	
	// num0과 num1은 add함수의 지역변수이다.
		public static int total(int num0, int num1) {
			int sum = 0;
			for(int i=num0;i<=num1;i++) {
				sum += i;
			}
			return sum;
		}
		
		public static void main(String[] args) {
//			int result = total(10, 100);
//			위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//			total메서드를 작성하고 사용해보세요.
			
			int result = total(1, 100);
			System.out.println("누적합은 " + result);
			
			int result1 = total(10, 20);
			System.out.println("누적합은 " + result1);
			
			int result2 = total(1, 1000);
			System.out.println("누적합은 " + result2);
		}
	}
