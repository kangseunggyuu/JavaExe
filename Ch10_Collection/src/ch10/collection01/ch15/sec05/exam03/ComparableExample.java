package ch10.collection01.ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		//TreeSet 컬랙션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//객체 저장
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		treeSet.add(new Person("강승규", 87));
		treeSet.add(new Person("김시언", 92));
		treeSet.add(new Person("김인기", 18));
		treeSet.add(new Person("강태윤", 21));
		treeSet.add(new Person("김시찬", 25));
		treeSet.add(new Person("홍상표", 12));
		
		//객체를 하나씩 가져오기
		for(Person person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}
	}
}
