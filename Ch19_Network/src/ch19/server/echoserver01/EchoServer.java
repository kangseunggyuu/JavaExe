package ch19.server.echoserver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* 서버는 클라이언트의 접속을 기다린다.
 * 스트림이 연결되면 서버<->클라이언트 중 누구나 서로 데이터를 송수신할 수 있다.
 * 스트림이 닫히면 더 이상 통신이 되지 않는다.
 * */
public class EchoServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		try {
			// 이 서버 프로그램이 돌아가는 환경의 ip주소를 자동으로 소켓에 할당
			ServerSocket server = new ServerSocket(PORT);
			// 클라이언트가 접속했을 때 등록해주는 역할
			System.out.println("Client 접속을 기다립니다......");

			// 클라이언트와 직접 통신(서비스)하는 소켓 객체 리턴
			// 클라이언트와 연결과정(스트림 형성 과정)이 완료되면 리턴
			Socket socket = server.accept();
			// 실제 통신은 위에 입력한 값이 함.

			// 클라이언트의 접속 신원 확인
			InetAddress inetAddr = socket.getInetAddress();
			System.out.println(inetAddr.getHostAddress() + "로부터 접속");

			/*
			 * Low Level 통신에서는 위의 socket을 통해 직접 통신하지만 우리는 좀 더 편리한 통신을 위해 필터클래스를 사용하겠다.
			 */
			OutputStream out = socket.getOutputStream(); // to Client 전송
			InputStream in = socket.getInputStream(); // from Client 수신
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); // 전송
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); // 수신

			// 클라이언트와 통신 시작
			String line;
			while (true) {
				line = br.readLine();	// 내부 버퍼로부터 '\n'까지 읽어들여라.
				if (line == null) // 통신이 끊어졌다. 상대방이 종료했다.
					break;
				System.out.println("클라이언트로부터 수신 : " + line);
				pw.println(line); // 데이터 + '\n';
				pw.flush(); // 버퍼에 남아있는 데이터 즉시 전송해
			}
			System.out.println("클라이언트-서버 종료");
			pw.close();
			br.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
