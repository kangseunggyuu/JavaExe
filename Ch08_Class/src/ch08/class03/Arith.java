package ch08.class03;


/* static 메서드는 객체를 만들지 않아도 메모리에 자동으로 올라간다.
 * 
 * [용도]
 * 범용적인 기능의 함수를 만들 때
 * 어느 곳에서나 쉽게 사용하고 싶은 함수를 만들 때
 * 객체에 따라 변수의 값의 적용을 다르게 받지 않아도 될 때
 * */
public class Arith {
	public static int add(int num0, int num1) {
		return num0 + num1;
	}
	public static int sub(int num0, int num1) {
		return num0 - num1;
	}
	public static int mul(int num0, int num1) {
		return num0 * num1;
	}
	public static int div(int num0, int num1) {
		return num0 / num1;
	}
}
