package ch15.thread01.ch14.sec07.exam01;

public class PrintThread extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	/* [스레드를 종료하는 1번째 방법]
	 * 계속 동작해야 하는 스레드를 while문을 종종 사용한다.
	 * 이 스레드를 종료하기 위해서는 아래처럼 boolean stop을 사용하면
	 * stop이 true일 때 while문은 더 이상 반복되지 않고 종료되게 된다.
	 * */
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
