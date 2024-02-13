package ch15.thread02;

public class ThreadSleep {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				int sum = 0;
				for(int i=0;i<10;i++) {
					sum += i;
					System.out.println("누적합은: " + sum);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace(); // 예외처리
					}
				}
				System.out.println("총합은: " + sum);
				Thread workThread = Thread.currentThread();
				System.out.println(workThread.getName() + "스레드 종료");
			}
		});
		t1.start();
		
		try {
			Thread.sleep(5000); //main스레드 종료시간
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + "스레드 종료");
	}
}
