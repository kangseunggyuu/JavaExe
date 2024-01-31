package ch09.extends04;

public class GrandFather {
	int handsomeScore;
	
	GrandFather(){
		System.out.println("GrandFather 생성자");
	}
	
	GrandFather(int score){
		this.handsomeScore = score;
		System.out.println("GrandFather 생성자");
	}
	
	void handsome() {
		System.out.println("잘 생겼다~");
	}
}
