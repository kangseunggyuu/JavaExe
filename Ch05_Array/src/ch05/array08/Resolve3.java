package ch05.array08;

import java.util.Arrays;

public class Resolve3 {

	public static void main(String[] args) {
//		정수 배열 5개를 할당하고
//		System.out.println(Arrays.toString(numArr));
//		로 배열을 출력했을 때 거꾸로 출력되도록
//		배열의 값을 거꾸로 저장하세요.
		
		int[] numArr = {18,90,85,34,56};
		int[] numArr1= new int[5];
		
		for(int i=numArr.length-1;i>=0;i--) {
			System.out.println(Arrays.toString(numArr));
		}
		
	}

}
