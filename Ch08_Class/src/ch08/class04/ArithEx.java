package ch08.class04;

/* 일반 메서드는 객체를 만들어서 호출해야 한다.
 * */
public class ArithEx {
	public static void main(String[] args) {
		int a=10, b=5;
		int result = 0;
		
		Arith arith = new Arith();
		
		result = arith.add(a, b);
		System.out.println(result);
		result = arith.sub(a, b);
		System.out.println(result);
		result = arith.mul(a, b);
		System.out.println(result);
		result = arith.div(a, b);
		System.out.println(result);
	}
}
