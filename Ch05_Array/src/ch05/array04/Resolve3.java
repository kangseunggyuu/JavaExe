package ch05.array04;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		// 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		double avg = 0.0;
		
		for(int i=0; i<=7; i++) {
			System.out.println((i+1) + "번 학생 점수 입력 >>");
			int score = sc.nextInt();
			total += score;
		}
		
		avg=(double)total/7;
		
		System.out.println("총점은" + total);
		System.out.println("평균은" + avg);
		sc.close();
	}

}
