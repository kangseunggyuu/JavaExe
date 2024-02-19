package ncp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		// 빙고판 생성
		int[][] board = generateBingoBoard();
		// 게임 시작
		playBingo(board);
	}
	
	// 빙고판 생성 메서드
	public static int[][] generateBingoBoard() {
		int[][] board = new int[5][5];
		List<Integer> numbers = new ArrayList<>();
		// 1부터 25까지의 숫자를 리스트에 추가
		for (int i = 1; i <= 25; i++) {
			numbers.add(i);
		}

		// 랜덤으로 섞기
		Collections.shuffle(numbers);

		// 빙고판에 숫자 배치
		int index = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				board[i][j] = numbers.get(index++);
			}
		}
		return board;
	}

	// 빙고 게임 진행 메서드
	public static void playBingo(int[][] board) {
		Scanner scanner = new Scanner(System.in);
		boolean[][] checked = new boolean[5][5];
		System.out.println("==== 빙고 게임 시작 ====");
		while (true) {

			// 빙고판 출력
			printBoard(board, checked);

			// 숫자 입력 받기
			System.out.print("숫자를 입력하세요: ");
			int number = scanner.nextInt();

			// 해당 숫자 체크
			markNumber(board, checked, number);

			// 빙고 체크
			if (isBingo(checked)) {
				System.out.println("빙고! 축하합니다!");
				break;
			}
		}
		scanner.close();
	}
	
	// 빙고판 출력 메서드
	public static void printBoard(int[][] board, boolean[][] checked) {
		System.out.println("-------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (checked[i][j]) {
					System.out.print("| * ");
				} else {
					System.out.printf("| %02d ", board[i][j]);
				}
			}
			System.out.println("|");
			System.out.println("-------------");
		}
	}

	// 해당 숫자 체크 메서드
	public static void markNumber(int[][] board, boolean[][] checked, int number) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (board[i][j] == number) {
					checked[i][j] = true;
					return;
				}
			}
		}
	}

	// 빙고 체크 메서드
	public static boolean isBingo(boolean[][] checked) {
		// 가로, 세로 체크
		for (int i = 0; i < 5; i++) {
			if (checked[i][0] && checked[i][1] && checked[i][2] && checked[i][3] && checked[i][4]) {
				return true; // 가로 빙고
			}
			if (checked[0][i] && checked[1][i] && checked[2][i] && checked[3][i] && checked[4][i]) {
				return true; // 세로 빙고
			}
		}
		// 대각선 체크
		if (checked[0][0] && checked[1][1] && checked[2][2] && checked[3][3] && checked[4][4]) {
			return true; // 왼쪽 위에서 오른쪽 아래로 대각선 빙고
		}
		if (checked[0][4] && checked[1][3] && checked[2][2] && checked[3][1] && checked[4][0]) {
			return true; // 오른쪽 위에서 왼쪽 아래로 대각선 빙고
		}
		return false;
	}
}