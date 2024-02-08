package ch13.sec01;

/* T는 대명사이다
 * E, A, MY, HELLO... 모두 가능하다.
 * T는 자료형을 프로그래머가 직접 선택하라는 의미이다.
 * 다만 T는 (Type)을 의미한다.
 * 
 * 내부 구조는 같으나 자료형만 다르다.
 * */

public class Box<T> {
	public T content;
}
