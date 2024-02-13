package ch15.thread01.ch14.sec05.exam03;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try {Thread.sleep(5000);}catch (InterruptedException e) {}
		workThreadA.work = false; // A스레드는 아무것도 안하고 넘기기만 한다.
		
		try {Thread.sleep(10000);}catch (InterruptedException e) {}
		workThreadA.work = true;
	}
}
