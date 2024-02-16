package ch18.fileio.charstream02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* 1) 바이트 스트림 : 있는 그대로 읽고, 있는 그대로 쓰기
 *               메모리에 있는 데이터가 그대로 파일에 기록
 * 2) 문자 스트림 : 메모장으로 읽기 위한 텍스트 파일로
 *              개행처리가 OS마다 다르다.
 *              java의 클래스는 OS마다 알맞게 개행 처리를 해준다.
 *              '\n' -> Unix/Linux : '\n'
 *                      Windows : '\r\n'
 *                      Mac : '\r'
 * */
public class FileWriterStream {
	public static void main(String[] args) throws IOException {
		char ch1 = 'A';
		char ch2 = 'B';
		
		Writer out = new FileWriter("hyper.txt");
		out.write(ch1);
		out.write(ch2);
		out.close();
	}
}





