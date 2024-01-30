package ch03.continue11;

public class Resolve1 {

	public static void main(String[] args) {
		// p. 138 3번
		int sum = 0;
		for (int i=1;i<=100;i++) {
			if (i%3==0)
				sum = sum + i;

		}

		System.out.println("1~100까지 3의 배수의 총합은 " + sum);
		
	}

}
