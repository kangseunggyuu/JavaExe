package ch05.array08;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		// 정수 배열 5개를 할당하고
		// Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요.
		int[] numArr = { 10, 99, 2, 78, 32, 1, 67, 105, 187, 23 };

		int min, max;
		min = max = numArr[0];

		for (int i = 1; i < numArr.length; i++) {
			// 최소값
			if (min > numArr[i])
				min = numArr[i];

			// 최대값
			if (max < numArr[i])
				max = numArr[i];
		}

		System.out.println("최소값은 " + min);
		System.out.println("최대값은 " + max);
	}
}