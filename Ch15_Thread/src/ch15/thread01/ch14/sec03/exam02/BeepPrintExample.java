package ch15.thread01.ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
	// main함수(주인 아저씨)가 해야할 일
	public static void main(String[] args) {
		// main스레드(주인 아저씨)가 work스레드(알바생)를 고용한다
		Thread thread = new Thread(new Runnable() {
			
			// 알바생이 해야할 일
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
		});
		
		// work스레드(알바생) 일 시작해
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
