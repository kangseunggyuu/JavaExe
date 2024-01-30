package ch03.control07.ch04.sec03;

public class SwitchExpressionExample {

	public static void main(String[] args) {
char grade = 'b';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		}
		
		switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다.");
		case 'B', 'b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("손님입니다");
		}
	}
}