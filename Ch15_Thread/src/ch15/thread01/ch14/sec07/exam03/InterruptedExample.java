package ch15.thread01.ch14.sec07.exam03;

public class InterruptedExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
		}
		
		thread.interrupt();
	}
}
