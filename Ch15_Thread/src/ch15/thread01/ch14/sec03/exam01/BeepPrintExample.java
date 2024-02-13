package ch15.thread01.ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		// Work 스레드 생성 -> start() -> run() 실행
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++){
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
