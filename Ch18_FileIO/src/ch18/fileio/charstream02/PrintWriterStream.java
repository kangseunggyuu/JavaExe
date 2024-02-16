package ch18.fileio.charstream02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		Writer wt = new FileWriter("printf.txt");
		
		/* Console출력 메서드를 파일출력에 사용할 수 있게 제공해주는 필터 클래스*/
		PrintWriter out = new PrintWriter(wt);
		out.println("PrintWriter 사용법입니다");
		out.printf("제 나이는 %d살입니다\n", 24);
		out.printf("원주율을 %f입니다\n", 3.14);
		out.println();
		out.println("자바가 좋아요");
		out.println("모두 다 좋아요");
		out.close();
	}
}







