package ch09.interface12;

/* 인터페이스 == 추상클래스
 * 모든 메서드가 추상 메서드
 * 
 * 1) 상속을 전제로 한다
 * 2) 부모의 인터페이스 변수에 자식 객체를 저장할 수 있다.
 * 3) 다형성의 의미(묶어서 관리 easy, 각 변수는 저장객체에 따라 각각 개성있게 동작)
 * 4) 클래스와 클래스를 연결
 * 5) 유연한 설계
 * 6) Design Pattern
 * 7) literal constant => 의미있는 문자열 constant
 * */
public interface StarUnit {
	public void walk();
	public void attack();
	public void die();
}











