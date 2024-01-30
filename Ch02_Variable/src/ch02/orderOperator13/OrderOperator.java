package ch02.orderOperator13;

public class OrderOperator {
	public static void main(String[] args) {
		/*
		 * 연산자 우선순위
		 * = 는 가장 마지막에 연산이 된다
		 * 먼저 연산하고 싶은 항목은 ()로 묶어라
		 */
		int result = 10 + 50 * 3;
		System.out.println(result);
		result = (10 + 50) * 3;
		System.out.println(result);
	}
}
