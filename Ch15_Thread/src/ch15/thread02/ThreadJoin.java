package ch15.thread02;

public class ThreadJoin {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				int sum = 0;
				for(int i=0;i<10;i++) {
					sum += i;
					System.out.println("누적합은: " + sum);
					
					try {
						Thread.sleep(300);
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
			// vm내의 스레드 종료 신호를 기다리고 있다.
			// run()이 리턴 되면 스레드는 종료 신호를 VM에 보낸다.
			// 종료 신호(Signal)가 오면 join()은 리턴한다.
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + "스레드 종료");
	}
}
