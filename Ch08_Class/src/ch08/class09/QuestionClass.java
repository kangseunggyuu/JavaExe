package ch08.class09;

import java.util.Scanner;

/*
1.FruitMain클래스에		
	현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어
	있습니다.
	아래처럼 seller를 중심으로 수정하세요.
	seller.saleApple(buyer, 2000);

2. 중화요리집을 임의대로 클래스로 만드세요

3. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
   클래스로 설계해서 프로그래밍 하세요
   
4. 노래를 나타내는 Song이라는 클래스를 설계하세요.
   <필드>
    노래제목 title
    가수    artist
    앨범제목 album
    작곡가  composer
    노래가 발표된 연도 year
    노래가 속한 앨범에서의 트랙 번호를 나타내는 track

   <메서드>
    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
    노래의 정보를 나타내는 show()

   <main 실행>
    ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
    Show()로 출력하세요

5. Rectangle클래스를 작성하세요
   int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
   void set(int x1, int y1, int x2, int y2) : 좌표 설정
   int square() : 사각형 넓이 리턴
   void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
   boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴
*/

public class QuestionClass {

	public static void printMenu() {
		// menuStr에 문제를 복사한다
		String menuStr = "1.FruitMain클래스에		\r\n" + "	현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어\r\n"
				+ "	있습니다.\r\n" + "	아래처럼 seller를 중심으로 수정하세요.\r\n" + "	seller.saleApple(buyer, 2000);\r\n" + "\r\n"
				+ "2. 중화요리집을 임의대로 클래스로 만드세요\r\n" + "\r\n" + "3. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 \r\n"
				+ "   클래스로 설계해서 프로그래밍 하세요\r\n" + "   \r\n" + "4. 노래를 나타내는 Song이라는 클래스를 설계하세요.\r\n" + "   <필드>\r\n"
				+ "    노래제목 title\r\n" + "    가수    artist\r\n" + "    앨범제목 album\r\n" + "    작곡가  composer\r\n"
				+ "    노래가 발표된 연도 year\r\n" + "    노래가 속한 앨범에서의 트랙 번호를 나타내는 track\r\n" + "\r\n" + "   <메서드>\r\n"
				+ "    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌\r\n" + "    노래의 정보를 나타내는 show()\r\n" + "\r\n"
				+ "   <main 실행>\r\n" + "    ABBA의 \"Dancing Queen\"노래를 Song객체로 생성하고\r\n" + "    Show()로 출력하세요\r\n"
				+ "\r\n" + "5. Rectangle클래스를 작성하세요\r\n" + "   int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표\r\n"
				+ "   void set(int x1, int y1, int x2, int y2) : 좌표 설정\r\n" + "   int square() : 사각형 넓이 리턴\r\n"
				+ "   void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력\r\n"
				+ "   boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 좌표의 직사각형이면 true 리턴\r\n" + "";

		System.out.println("\n\n\n------------------------------------");
		System.out.println(menuStr);
	}

// 문제 번호를 선택하는 메서드
// sc 매개변수는 입력을 받기 위한 Scanner 객체를 전달받는 변수
	public static int getSelectMenu(Scanner sc) {

		System.out.print("\n\n 메뉴 선택 >> ");

		// 문자열 번호 -> 정수로 변환
		String strNum = sc.next();
		int num = Integer.parseInt(strNum);

		return num;
	}

// 1번 문제에 대한 풀이
	public static void answer1(Scanner sc) {

	}

// 2번 문제에 대한 풀이
	public static void answer2(Scanner sc) {

	}

// 3번 문제에 대한 풀이
	public static void answer3(Scanner sc) {

	}

// 4번 문제에 대한 풀이
	public static void answer4(Scanner sc) {

	}

// 5번 문제에 대한 풀이
	public static void answer5(Scanner sc) {

	}

// 전체의 시작인 main 메서드
	public static void main(String[] args) {

		/*
		 * Scanner를 생성/close()를 반복하면 Error가 발생하므로 객체를 1번 생성해놓고 메서드의 매개변수로 전달해서 사용하도록 한다
		 */
		Scanner sc = new Scanner(System.in);

		// isRun이 true면 반복이 계속되고, false면 반복문 탈출
		boolean isRun = true;

		while (isRun) {
			printMenu(); // 메뉴 보여주기
			int selNum = getSelectMenu(sc); // 번호 선택하기

			switch (selNum) {
			case 1:
				answer1(sc); // 1번문제해답
				break;
			case 2:
				answer2(sc); // 2번문제해답
				break;
			case 3:
				answer3(sc); // 3번문제해답
				break;
			case 4:
				answer4(sc); // 4번문제해답
				break;
			case 5:
				answer5(sc); // 5번문제해답
				break;
			case 6:
				isRun = false; // 6번 탈출
				break;
			default:
				System.out.println("번호를 잘 못 입력했습니다.");
				break;
			}
		}

		System.out.println("Program End~");

		// 키보드 입력을 받는 스트림 종료
		sc.close();
	}
}
