package ch15.thread01.ch14.sec06.exam02;

/* 순서를 맞춰주는 동기화 기법
 * 2개의 스레드가 순서대로 1번씩 처리하는 동기화할 때 */

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}
}
