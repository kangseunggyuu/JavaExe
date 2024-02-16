package ch10.lambda02.ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		//정적 메소드일 경우(클래스 소속)
		//람다식
		//person.action((x, y) -> Computer.staticMethod(x, y));
		//메소드 참조
		person.action(Computer :: staticMethod);
		
		
		//인스턴스 메소드일 경우(객체 소속)
		Computer com = new Computer();
		//person.action((x, y) -> Computer.staticMethod(x, y));
		//메소드 참조
		person.action(com :: instanceMethod);	
	}
}
