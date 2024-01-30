package ch04.primitive;

import java.util.Arrays;

public class RefTypeEx {
	public static void main(String[] args) {
		// 클래스는 Reference Type(참조 타입이다)
		int[] arr = {10, 20, 30};	// 배열 클래스
		String name = "홍길동";		// String 클래스
		int[] arr1 = new int[3];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		String name1 = new String("임꺽정");		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(name);
		System.out.println(Arrays.toString(arr1));
		System.out.println(name1);
		System.out.println();
		
		System.out.println(arr.hashCode());
		System.out.println(name.hashCode());
		System.out.println(arr1.hashCode());
		System.out.println(name1.hashCode());
	}
}

