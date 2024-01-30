package ch05.array07;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		int[] scores = {98, 12, 52, 93, 33, 54, 21};
		System.out.println(Arrays.toString(scores));
		
		// 정렬
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
	}
}








