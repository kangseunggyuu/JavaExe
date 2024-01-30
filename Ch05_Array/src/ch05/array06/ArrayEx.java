package ch05.array06;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {		
		// 얕은 복사
				int[] scores = {100, 88, 95, 67, 75};
				int[] scores1 = scores;
				int[] scores2 = scores1;
				
				System.out.println(Arrays.toString(scores));
				System.out.println(Arrays.toString(scores1));
				System.out.println(Arrays.toString(scores2));
				System.out.println(scores);
				System.out.println(scores1);
				System.out.println(scores2);
				System.out.println();
				
				scores[2] = 99999;
				System.out.println(Arrays.toString(scores));
				System.out.println(Arrays.toString(scores1));
				System.out.println(Arrays.toString(scores2));
				System.out.println();
				
				// 깊은 복사(힙에 별도의 공간을 생성한 후 scores4는 
				//        새로 생성한 공간을 가리키게 된다)
				// ; 기존 공간과 분리되는 공간이다.
				int[] scores4 = 
						Arrays.copyOf(scores, scores.length); 
				System.out.println(Arrays.toString(scores));
				System.out.println(Arrays.toString(scores4));
				System.out.println();
				
				scores[2] = 11111111;
				System.out.println(Arrays.toString(scores));
				System.out.println(Arrays.toString(scores1));
				System.out.println(Arrays.toString(scores2));
				System.out.println(Arrays.toString(scores4));
	}
}








