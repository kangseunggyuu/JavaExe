package ch18.fileio.bytestream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 파일입출력 3단계(Device통신, Network통신도 동일)
 * - 특히 Linux는 사용하는 함수명도 동일하다.
 * 1) 스트림 생성(create, open)
 * 2) 쓰기 / 읽기(write/read, send/recv)
 * 3) 스트림 종료(close)
 * */
public class ByteFileCopy {
	public static void main(String[] args) throws IOException {
		/*------1) 스트림 생성------*/
		// putty.exe파일과 연결된 입력 스트림 생성
		InputStream in = new FileInputStream("putty.exe");
		// putty.exe를 푸티.exe로 저장할 출력 스트림 생성
		OutputStream out = new FileOutputStream("푸티.exe");
		int copyByte = 0;
		int bData;
		long stime = System.currentTimeMillis();
		/*------2) 스트림을 통해 입출력--------------*/
		while(true) {
			bData = in.read(); 	// 1byte씩 읽는다.
			if(bData == -1)		// 더 이상 읽을 것이 없다.
				break;
			out.write(bData);
			copyByte++;
		}
		long etime = System.currentTimeMillis();
		/*-------3) 스트림 연결 종료-----------------------*/
		in.close();
		out.close();
		System.out.println("복사 시간=" + (etime-stime));
		System.out.println("복사된 바이트 크기: " + copyByte);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
