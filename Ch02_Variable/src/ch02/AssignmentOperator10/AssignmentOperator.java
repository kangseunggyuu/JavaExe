package ch02.AssignmentOperator10;

public class AssignmentOperator {
	public static void main(String[] args) {
		int num = 0;
		/*
		 * 변수는 =를 기준으로 왼쪽에서는 저장공간
		 * 오른쪽에서는 공간에 들어있는 값의 의미를 갖는다.
		 * 
		 * =는 항상 오른쪽의 연산이 끝난 후 왼쪽에 대입된다.
		 */
		num = num + 10;
		System.out.println(num);
		num = num + 20;
		System.out.println(num);
		
		num += 30;		// num = num + 30;
		System.out.println(num);
		num += 40;
		System.out.println(num);
	}
}






