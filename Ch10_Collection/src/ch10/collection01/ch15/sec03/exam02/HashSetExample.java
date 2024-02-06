package ch10.collection01.ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬랙션 생성
		Set<Member> set = new HashSet<Member>();
		
//		Member mem0 = new Member("홍길동", 30);
//		Member mem1 = new Member("홍길동", 30);
//		
//		set.add(mem0);
//		set.add(mem1);
		
		//Member 객체 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		//저장된 객체 수 출력
	    System.out.println("총 객체 수: " + set.size());
	}
}
