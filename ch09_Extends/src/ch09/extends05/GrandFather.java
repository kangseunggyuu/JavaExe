package ch09.extends05;

public class GrandFather {
	private int handsomeScore;
	
	public GrandFather(){
		System.out.println("GrandFather 생성자");
	}
	
	public GrandFather(int score){
		this.handsomeScore = score;
		System.out.println("GrandFather 생성자");
	}
	
	public void handsome() {
		System.out.println("잘 생겼다~");
	}
}
