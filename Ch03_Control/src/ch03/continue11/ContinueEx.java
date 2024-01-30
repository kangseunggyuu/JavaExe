package ch03.continue11;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			System.out.printf("3*%d=%d\n", i, 3*i);
		}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			// i가 5보다 크면 아래를 실행하지 말고 반복문으로 돌아가라
			if(i>5)
				continue;
			System.out.printf("3*%d=%d\n", i, 3*i);
		}

	}

}
