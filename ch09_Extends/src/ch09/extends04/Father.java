package ch09.extends04;

public class Father extends GrandFather{
	long money = 10000000000000L;
	
	Father(){
		System.out.println("Father 생성자");
	}
	
	Father(int score, long money){
		super(score);	//GrandFather 매개변수의 생성자
		this.money = money;
		System.out.println("Father 매개변수 생성자");
	}
	
	void wealth() {
		System.out.println("돈을 많이 벌었다.");
	}
}
