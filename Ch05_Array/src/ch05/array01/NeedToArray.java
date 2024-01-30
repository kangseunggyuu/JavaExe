package ch05.array01;

import java.util.Scanner;

public class NeedToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 학생 수가 만약 3명이 아니라 전교 or 전국 학생이라면
		 * 아래처럼 변수를 선언하는 것은 거의 불가능하다.
		 * 그래서 새로운 문법이 필요해서 만들어진다.
		 * kor0과 kor1, kor2의 공통점은
		 * 3개 모두 int 자료형, kor이라는 이를
		 * 그리고 뒤에 붙은 숫자는 순서를 나타낸다는 것이다.
		 */
		// 3명의 국어점수 입력
		System.out.print("1번째 학생 국어점수 입력 >> ");
		int kor0 = sc.nextInt();
		System.out.print("2번째 학생 국어점수 입력 >> ");
		int kor1 = sc.nextInt();
		System.out.print("3번째 학생 국어점수 입력 >> ");
		int kor2 = sc.nextInt();
		
		int total = kor0 + kor1 + kor2;
		double avg = (double)total/3;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
		
		sc.close();
	}
}








