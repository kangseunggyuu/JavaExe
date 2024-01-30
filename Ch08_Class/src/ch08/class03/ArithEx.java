package ch08.class03;

/* static 메서드는 객체를 만들지 않아도 바로 사용가능하다.
 * */
public class ArithEx {
	public static void main(String[] args) {
		int a=10, b=5;
		int result = 0;
		result = Arith.add(a, b);
		System.out.println(result);
		result = Arith.sub(a, b);
		System.out.println(result);
		result = Arith.mul(a, b);
		System.out.println(result);
		result = Arith.div(a, b);
		System.out.println(result);
	}
}
