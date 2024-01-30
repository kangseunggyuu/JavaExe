package ch05.array08;

import java.util.Arrays;
import java.util.Scanner;

public class Resolve1 {

	public static void main(String[] args) {
		// 정수 배열 5개를 할당하고
		// Arrays.sort를 활용해서 최소값과 최대값을 얻으세요.
		
		int[] numArr = { 10, 99, 2, 78, 32 };

		System.out.println(Arrays.toString(numArr));
		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));

		System.out.println("최소값은 " + numArr[0]);
		System.out.println("최대값은 " + numArr[numArr.length - 1]);
	}
}