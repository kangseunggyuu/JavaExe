package ch19.server.webserver03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
	public static void main(String[] args) {
		final int PORT = 80; // https는 디폴트로 80포트를 사용
		// 현재 서버 프로세스가 동작하는 환경의 ip 주소를 자동으로 할당
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			String mainThreadName = Thread.currentThread().getName();
			while (true) {
				System.out.printf("<서버-%s> 브라우저 접속을 대기합니다...\n", mainThreadName);
				Socket socket = serverSocket.accept();
				System.out.printf("<서버-%s> 새로운 스레드를 시작합니다.\n", mainThreadName);
				HttpThread ht = new HttpThread(socket);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class HttpThread extends Thread {
	private Socket socket;

	public HttpThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.printf("<서버-%s>%s로부터 접속했습니다.\n", getName(), inetAddr.getHostAddress());
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			/* 브라우저가 요청한 파일 찾기 */
			String line = br.readLine();
			int start = line.indexOf(" ") + 2;
			int end = line.lastIndexOf("HTTP") - 1;
			String fileName = line.substring(start, end);
			if(fileName.equals(""))
				fileName = "index.html";
			System.out.printf("<서버-%s>사용자가 %s를 요청했습니다.\n", getName(), fileName);
			
			/* 요청한 파일을 읽어서 브라우저에 전달하기 */
			BufferedReader fileBr = new BufferedReader(new FileReader(fileName));
			String fileLine;
			while(true) {
				fileLine = fileBr.readLine();
				if(fileLine==null)
					break;
				pw.println(fileLine);
				pw.flush();
			}
			System.out.printf("<서버-%s>브라우저에 %s를 전송했습니다.\n", getName(), fileName);
			
		} catch (Exception e) {
			System.out.printf("<서버-%s>%s\n", getName(), e.getMessage());
		}
	}
}