package ch06.Method01;

public class Resolve3 {
	
	// num0과 num1은 add함수의 지역변수이다.
		public static int add(int num0, int num1) {
			int result = num0 + num1;
			return result;
		}
		
		public static void main(String[] args) {
//			int result = total(10, 100);
//			위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//			total메서드를 작성하고 사용해보세요.
			
			int result = add(11, 5);
			System.out.println("결과값은 " + result);
			
			// main함수의 지역변수로 Stack에 num0과 num1이 초기화되어 생성된다.
			int num0 = 10, num1 = 5;
			int result1 = add(num0, num1);
			System.out.println("결과값은 " + result1);
			
			int a = 3, b = 7;
			int result2 = add(a, b);
			System.out.println("결과값은 " + result2);
		}
	}
