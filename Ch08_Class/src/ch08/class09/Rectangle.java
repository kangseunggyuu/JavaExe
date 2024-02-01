package ch08.class09;

public class Rectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int square() {
		int base = Math.abs(x1 - x2);
		int height = Math.abs(y1 - y2);
		
		return base*height;
	}
	public void show() {
		int leftX = x1 < x2 ? x1 : x2;
		int topY = y1 < y2 ? y1 : y2;
		int rightX = x1 > x2 ? x1 : x2;
		int bottomY = y1 > y2 ? y1 : y2;
		System.out.println("좌상단 x1 = " + leftX);
		System.out.println("좌상단 y1 = " + topY);
		System.out.println("우하단 x2 = " + rightX);		
		System.out.println("우하단 y2 = " + bottomY);
		System.out.println("넓이 = " + square());
	}
	public boolean equals(Rectangle r) {
		if(this.x1 == r.x1 &&
		   this.y1 == r.y1 &&
		   this.x2 == r.x2 &&
		   this.y2 == r.y2)
			return true;
		
		return false;
	}
}
