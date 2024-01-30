package ch03.while08;

public class Resolve3 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			System.out.println(i + " " + sum);
			System.out.println();
			i++;
		}
		
		System.out.println("1~10의 합은" + sum);

	}

}
