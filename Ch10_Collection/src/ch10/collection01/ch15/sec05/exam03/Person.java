package ch10.collection01.ch15.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	@Override
//	public int compareTo(Person o) {
//		if(age<o.age) return -1;
//		else if(age == o.age) return 0;
//		else return 1;
//	}
	public int compareTo(Person o) {
		return name.compareTo(o.name);		//이름순으로 정렬
//		return name.compareTo(o.name)*-1;	//역정렬

	}
}
