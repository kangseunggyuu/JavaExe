package ch05.array04;

public class Resolve1 {

	public static void main(String[] args) {
		//String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요.
		String[] names = {"하나", "둘", "셋", "넷", "다섯", "여섯", "일곱", "여덟", "아홉", "열"};
		
		System.out.println(names.length);
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
	}

}
