package ch15.thread02;

/*
 * [스레드 생성 요청하는 2가지 방법]
 * vm 내부에 스레드의 리소스가 존재하고
 * 우리는 객체의 참조 변수로 스레드의 동작을 제어한다.
 * 1) Thread 클래스의 상속 받는 클래스 구현
 * 2) Runnable 인터페이스의 상속 받는 클래스 구현
 * 	: 이미 다른 클래스의 상속을 받은 클래스에서 스레드를 동작시키려면
 * 	  Thread클래스를 더 이상 상속시킬 수 없다.
 * 	  왜냐하면 Java는 단일 상속이니까.
 * 	  그래서 이미 다른 클래스의 상속 받은 클래스에서 스레드를 동작시키기 위해
 * 	  Runnable 인터페이스를 상속 받는 방법을 제시했다.
 * 
 * 모두 run()에 스레드가 해야할 일을 구현한다.
 * start()를 호출하면 스레드가 동작을 시작한다.
 */

class ShowNameThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i + " 안녕하세요: " + this.getName() + "입니다.");
			
			try {
				sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(this.getName() + "스레드 종료");
	}
	
}

public class ExtendsThread {
	public static void main(String[] args) {
		// Thread 2개가 vm에 할당되어 준비하고 있는 상태
		ShowNameThread t1 = new ShowNameThread();
		ShowNameThread t2 = new ShowNameThread();
		ShowNameThread t3 = new ShowNameThread();
		ShowNameThread t4 = new ShowNameThread();
		
		// 스레드를 동작(run()을 호출)
		System.out.println("t1 스레드 객체 동작"); t1.start();
		System.out.println("t2 스레드 객체 동작"); t2.start();
		System.out.println("t3 스레드 객체 동작"); t3.start();
		System.out.println("t4 스레드 객체 동작"); t4.start();
		System.out.println("main 스레드 종료");
	}
}
