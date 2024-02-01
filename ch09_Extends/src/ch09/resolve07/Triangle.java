package ch09.resolve07;

//2. 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의합니다
//생성과 동시에 초기화가 가능한 생성자도 정의합니다
//밑변과 높이 정보를 변경시킬 수 있는 메소드를 정의합니다
//삼각형의 넓이를 계산해서 반환하는 메소드도 정의합니다
//객체를 만들어서 사용해보세요

public class Triangle {
	int base;
	int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	public int area() {
		return base * height/2;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
