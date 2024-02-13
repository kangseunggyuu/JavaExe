package ch10.lambda02.ch16.sec02.exam02;

public class Button {
	// 정적 멤버 인터페이스
	@FunctionalInterface
	public static interface ClickListener{
		//추상 메소드
		void onClick();
	}
	
	// 필드
	private ClickListener clicklistener;
	
	//메소드
	public void setCliclListener(ClickListener clicklistener) {
		this.clicklistener = clicklistener;
	}
	
	public void click() {
		this.clicklistener.onClick();
	}
}
