package ch10.lambda02.ch16.sec05.exam03;

public class Person {
	public Member getMember1(Creatable1 creatable) {
		String id = "Winter";
		Member member = creatable.create(id);
		return member;
	}
	
	public Member getMember2(Creatable2 creatable) {
		String id = "Winter";
		String name = "한겨울";
		Member member = creatable.create(id, name);
		return member;
	}
}
