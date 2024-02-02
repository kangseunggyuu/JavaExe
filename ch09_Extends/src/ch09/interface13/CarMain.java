package ch09.interface13;

/*
[시나리오]
1. Bitcamp는 자동차 산업을 진출하기 위해 자동를 OEM 생산주문 하기로 결정했다.
   자동차의 Specification를 각 자동차 제조사에 제공하기 위해
   interface를 사용해서 구현해야 할 기능을 메서드로 정해서 자동차 제조사에 보냈다.
   - ICar 인테페이스 정한다.
   
2.A 자동차 제조사
   현재, 토요타, 포드는 ICar를 상속받아서 구현 클래스를 생성한다.
   이 구현 클래스의 메서드 기능은 각 회사의 기술력이 담겨질 것이다.
   구현 클래스가 완성되면 Bitcamp에 보내서 테스트를 진행할 예정이다.
   
2.B Bitcamp
   자동차 제조사에서 구현클래스(자동차)를 만드는 동안
   Bitcamp는 이미 정해진 약속인 ICar를 토대로 CarTester클래스를 제작한다.
   
3. 자동차제조사는 모두 자동차(구현클래스)를 완성해서 납품하였다.
   Bitcamp는 Main에서 자동차 객체를 생성하고
   CarTester객체에 주입하여 각 자동차의 테스트를 진행한다.
   
4. 테스트 후 최종 점수를 비교하여 제조사를 선택한다.
*/
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
