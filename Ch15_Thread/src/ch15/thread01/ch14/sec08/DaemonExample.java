package ch15.thread01.ch14.sec08;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		/* C/C++은 원래 대몬 스레드이다
		 * C#/Java는 위의 속성을 없애기 위한 별도의 동기화 작업이 필요하다.
		 * 그래서 불편해서 그냥 별개로 동작하도록 만들었고
		 * 아래처럼 Set Daemon(true)일 때 종속적으로 만들었다.
		 * 
		 * 대몬 스레드(종속 스레드)
		 * 부모 스레드가 종료되면 자식도 함께 종료
		 * 
		 * 일반적으로 자식 스레드는 부모 스레드와 별개로 동작한다.
		 * */
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		System.out.println("메인 스레드 종료");
	}
}
