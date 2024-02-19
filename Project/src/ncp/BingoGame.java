package ncp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//	5*5 빙고판 만들기

public class BingoGame {
	public static void main(String[] args) {
		int [][] board = makeBingoBoard();
		
		playBingo(board);
	}
	
	public static int [][] makeBingoBoard(){
		int [][] board = new int[5][5];	// 2차원 배열을 사용하여 빙고판 만들기
		List<Integer> num = new ArrayList<>();
		
		for(int i=1; i<=25; i++) {
			num.add(i);	// 반복문을 사용하여 1~25 값을 List에 넣기
		}
		
		Collections.shuffle(num);
		
		int Number = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<0; j++) {
				board[i][j] = num.get(Number++);
			}
		}
		
		return board;
		
	}
	
	public static void printBingo(int[][] board, boolean[][] checked) {
		System.out.println(" -------------------- ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(checked[i][j]) {
					System.out.print("| * ");
				} else {
					System.out.printf("| %02d ", board[i][j]);
				}
			}
			System.out.println("|");
			System.out.println(" -------------------- ");
		}
	}
	
	public static void playBingo(int[][] board) {
		Scanner sc = new Scanner(System.in);	// 숫자 입력 받기
		boolean[][] checked = new boolean[5][5];
		System.out.println(" ====== 빙고 시작 ====== ");
		
		printBingo(board, checked);
		
		System.out.print("1~25 사이의 숫자를 입력하시오.");
		int Numbers = sc.nextInt();
		
		// 점수 체크 하는 코드
		
		if(isBingo(checked)) {
			System.out.println("빙고 축하드립니다!");
			break;
		}
		sc.close();
	}
}
