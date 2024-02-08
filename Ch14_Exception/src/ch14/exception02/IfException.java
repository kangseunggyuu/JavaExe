package ch14.exception02;

import java.util.Arrays;
import java.util.Scanner;

/* <프로그래밍의 오류를 처리하는 방식>
 * 1. C언어 방식: 함수의 리턴값으로 성공/실패/오류 여부를 판단한다.
 * 성공/실패: true/false
 * 여러가지 case: 정수(-1, 0, 1, 2...)
 * 2. C++언어 방식: Exception등장
 * 라이브러리로 제공되는 방식이 아니라서 개발자가 모두 직접 정의해야 함.
 * 나중에 추가된 문접이라 사용 시 성능저라가 일어난다.
 * 3. Java: 본격적으로 JDK메서드 내부에서 발생할 예외를 최대한 정의함.
 * 필요하면 사용자 추가 정의
 * */

/*
예전에는 if문으로
프로그래밍 처리 -> 에러 확인 -> 연산 처리
이렇게 프로그래밍을 하였다.

입력 등에 예상치 못한 일이 많이 발생하므로
프로그램에서 '오류 처리'가 프로그래밍 로직보다
점점 커지는 현상이 일어났다.
=> 코드의 가독성의 저하
=> 지저분해 보이는 현상
=> 비용이 증가 

그래서 Exception이라는 개념이 도입
=> try{
	// 프로그래밍 로직 실행
}catch{
	// try내에서 로직 실행 중 발생하 모든 에러를 처리하는 곳
}

Java는 JDK라는 라이브러리를 제공하므로 직접 여러 모듈/클래스/메서드를 설계했다.
설계 과정에서 일어날 수 있는 모든 Error에 대해서 '미리 정의된 Exception'을 
제공함으로써 개발자가 손쉽게 에러처리 할 수 있도록 도와준다.
물론 모든 것을 예측할 수 없으므로 개발자가 직접 작성해야 할 때도 있다.
*/

public class IfException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피제수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("제수 입력 >> ");
		int num1 = sc.nextInt();
		/* 값에 대한 에러 대응 처리 */
		if(num1==0) {
			System.out.println("제수는 0이 될 수 없습니다.");
			return;
		}
		System.out.println("나눗셈의 결과는 " + (num0/num1));
		
		final int MAX_ARR = 20;
		int[] arr = new int[MAX_ARR];
		System.out.print("숫자 입력 >> ");
		int input = sc.nextInt();
		System.out.print("저장한 배열 인덱스 입력(0~19) >> ");
		int idx = sc.nextInt();
		/* 값에 대한 에러 대응 처리 */
		if(idx < 0 || idx > MAX_ARR-1) {
			System.out.println("유효하지 않은 인덱스입니다.");
			return;
		}
		arr[idx] = input;
		System.out.println(Arrays.toString(arr));
		
		
		sc.close();
	}
}
