package ch09.resolve14.question02.order01;

import ch09.resolve14.question02.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;
	
	/* 외부에서 주입
	 * CarTest는 ICar에 의존적이다.
	 */
	public TabletTester(ITablet tablet) {
		this.tablet = tablet;
	}
	public TabletTester() {
		
	}
	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}
	public int movieTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.movie();		
		}
		return (int)(Math.random()*50) + 50;	//0이상~99이하
	}
	public int musicTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.movie();
		}
		return (int)(Math.random()*50) + 50;	//50이상~99이하
	}
	public int readBookTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.readBook();
		}
		return (int)(Math.random()*50) + 50;	//50이상~99이하
	}
}
