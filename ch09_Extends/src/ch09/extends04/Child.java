package ch09.extends04;

public class Child extends Father {
	float day = 365 + 1.0f/4;
	
	Child(){
		System.out.println("Child 생성자");
	}
	
	Child(int score, long money, float day){
		super(score, money);	// Father 매개변수의 생성자
		this.day = day;
		System.out.println("Child 매개변수 생성자");
	}
	
	void play() {
		System.out.println("인생이 즐겁다");
	}
}
