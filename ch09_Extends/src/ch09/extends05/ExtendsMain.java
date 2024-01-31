package ch09.extends05;

/*
 * [Java 접근 제한자]
 * 1) public: 누구라도 접근 가능
 * 2) protected: 같은 패키지 클래스 접근 가능 + 패키지가 달라도 자식 클래스는 가능
 * 3) default: 접근 제한자를 쓰지 않았을 때, 같은 패키지에 있는 클래스만 접근 가능
 * 4) private: 클래스 내에서만 나만 가능, 자식도 접근 불가능
 */
public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child(7, 99999L, 72);
		child.handsome();
		child.wealth();
		child.play();
		
		/*Private 접근 제한의 의해 Error 발생
		System.out.println("잘생김 점수: " + child.handsomeScore);
		System.out.println("돈: " + child.money);
		System.out.println("즐거운 날: " + child.day);
		 */
	}
}
