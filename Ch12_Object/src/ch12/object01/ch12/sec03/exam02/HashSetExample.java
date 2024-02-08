package ch12.object01.ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashset = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashset.add(s1);
		System.out.println("저장된 객체 수: " + hashset.size());
		
		//(1, 홍길동)에서 hashcode 1이 같기 때문에 저장이 되지 않음
		Student s2 = new Student(1, "홍길동");
		hashset.add(s2);
		System.out.println("저장된 객체 수: " + hashset.size());
		
		Student s3 = new Student(2, "홍길동");
		hashset.add(s3);
		System.out.println("저장된 객체 수: " + hashset.size());
	}
}
