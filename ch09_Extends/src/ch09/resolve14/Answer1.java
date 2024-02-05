package ch09.resolve14;

import java.util.Scanner;

import ch09.resolve14.question01.InkJetPrinter;
import ch09.resolve14.question01.LaserPrinter;
import ch09.resolve14.question01.P_INTERFACE;

public class Answer1 implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "1. 다음 상속구조를 설계하세요\r\n"
				+ "모든 프린터는 모델명, 제조사, 인터페이스 종류(USB, paraller port), 인쇄매수,\r\n"
				+ "인쇄 종이 잔량을 나타내는 정보를 가진다\r\n"
				+ "print()메서드를 갖는다.\r\n"
				+ "잉크젯프린터는 잉크 잔량이라는 추가 정보를 가진다\r\n"
				+ "레이저프린터는 토너 잔량이라는 추가 정보를 가진다\r\n"
				+ "print()메서드는 각 프린터 타입에 맞게 구현한다\r\n"
				+ "편의상 print()메서드를 한 번 호출할 때마다 인쇄용지 1매를 사용하는 것으로 한다\r\n"
				+ "클래스들을 설계하고\r\n"
				+ "적절한 필드, 생성자, 메서드를 작성하세요"
				+ "그리고 실행 프로그램을 작성해서 동작시키세요\r\n\r\n";
		
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		sc.nextLine();		// Enter치기 전까지 멈춰 있음
		
		InkJetPrinter ijP = 
				new InkJetPrinter("HP-264", "HP", 
						P_INTERFACE.USB, 20, 100, 50);
		ijP.print();
		ijP.print();
		ijP.print();
		System.out.println(ijP);
		
		LaserPrinter lP = 
				new LaserPrinter("Samsung-111", "Samsung", 
						P_INTERFACE.PARALLEL_PORT, 20, 100, 100);
		lP.print();
		lP.print();
		lP.print();
		System.out.println(lP);
		
		sc.nextLine();		// Enter치기 전까지 멈춰 있음
		
	}

	@Override
	public boolean isRun() {
		return true;
	}

}
