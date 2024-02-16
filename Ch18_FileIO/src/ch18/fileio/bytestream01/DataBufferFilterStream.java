package ch18.fileio.bytestream01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 바이너리 파일(기계어로 된 파일) => 메모장에서 열면 깨져 보인다.
 * ; 이미지, 영상, 실행파일...
 * 
 * 메모리의 변수값을 바이너리 파일로 저장시
 * 바이트 스트림 Class와 함께
 * Filter Class를 사용하면 편리하다.
 * */
public class DataBufferFilterStream {
	public static void main(String[] args) throws IOException {
		// 출력 스트림 생성
		OutputStream out = new FileOutputStream("data.bin");
		// 필터 클래스(변수값 저장에 편리한 기능 제공)
		DataOutputStream filterOut = new DataOutputStream(out);
		
		// 저장할 변수
		int num = 365;
		double pi = 3.14;
		// data.bin에 저장
		filterOut.writeInt(num);
		filterOut.writeDouble(pi);
		filterOut.close();			// 출력 스트림 종료
		
		// 입력스트림을 생성해서 읽어들이자.
		InputStream in = new FileInputStream("data.bin");
		DataInputStream filterIn = new DataInputStream(in);
		int inNum = filterIn.readInt();
		double inPi = filterIn.readDouble();
		filterIn.close(); 			// 입력 스트림 종료
		
		System.out.println("inNum=" + inNum);
		System.out.println("inPi=" + inPi);
	}
}











