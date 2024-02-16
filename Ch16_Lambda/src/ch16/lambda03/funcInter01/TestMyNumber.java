package ch16.lambda03.funcInter01;

public class TestMyNumber {
	public static void main(String[] args) {
		/* 람다식은 중간의 형식은 배제하고
		 * 결과에 집중하는 방식이다.
		 * 아래의 max는 인터페이스의 변수이다.
		 * (x, y) -> (x >= y) ? x : y를 max에 전달하면
		 * 컴파일러는 자동으로 MyNumber를 상속받은 익명의 클래스를 선언하고
		 * 익명 클래스의 객체를 생성새서 max에 전달한다.
		 * 
		 * 그리고 MyNumber의 유일한 추상매서드인 getMax의 내용을
		 * (x, y) -> (x >= y) ? x : y로 구성해준다.
		 * 
		 * max.getMax(10, 20)를 호출하면
		 * x=10, y=20이 전달되게 된다. 
		 * */
		MyNumber max = (x, y) -> (x >= y) ? x : y;	// 중간과정 없이 결론만
		System.out.println(max.getMax(10, 20));
		System.out.println(max);
	}
}
