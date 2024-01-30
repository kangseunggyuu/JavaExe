package ch05.array04;

import java.util.Scanner;

public class Resolve6 {

	public static void main(String[] args) {
		// 5명의 학생의 이름과 점수를 입력받고
		// A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
		
		Scanner sc = new Scanner(System.in);
		
		int score [] = new int[5];
		
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1) + "번째 학생의 점수를 입력하시오.");
			score[i]=sc.nextInt();
			
			if(score[i]>=90)
				System.out.println("A 학점입니다.");
			else if(score[i]>=80)
				System.out.println("B 학점입니다.");
			else if(score[i]>=80)
				System.out.println("C 학점입니다.");
			else if(score[i]>=70)
				System.out.println("D 학점입니다.");
			else if(score[i]>=60)
				System.out.println("E 학점입니다.");
			else
				System.out.println("F 학점입니다.");
		}
		

		
		sc.close();

	}

}
