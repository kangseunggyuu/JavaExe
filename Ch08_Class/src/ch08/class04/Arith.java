package ch08.class04;

/**
 * 객체가 최초 생성될 때 비로서 메서드가 메모리에 올라간다.
 * 객체가 있어야 사용가능하다.
 * 
 * 객체의 변수 값에 따라 영향을 받는 메서드는 일반 메서드로 만든다.
 */
public class Arith {
	public int add(int num0, int num1) {
		return num0 + num1;
	}
	public int sub(int num0, int num1) {
		return num0 - num1;
	}
	public int mul(int num0, int num1) {
		return num0 * num1;
	}
	public int div(int num0, int num1) {
		return num0 / num1;
	}
}
