package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LenovoTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LenovoTablet - 性价比很高");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LenovoTablet - 音乐良好");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LenovoTablet - 看书分辨率不错");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

}
