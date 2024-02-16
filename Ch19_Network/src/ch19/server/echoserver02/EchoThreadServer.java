package ch19.server.echoserver02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		try {
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("Client 접속을 기다립니다...");
			while(true) {
				// 1. 클라이언트 접속(스트림이 연결되면 socket객체가 리턴된다.)
				Socket socket = server.accept();
				// 2. 클라이언트 담당 스레드 생성하여 통신을 전담시킨다.
				EchoThread echoThread = new EchoThread(socket);
				echoThread.start();
			}			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

class EchoThread extends Thread{
	private Socket socket;
	
	public EchoThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.println(inetAddr.getHostAddress() + "로부터 접속했습니다.");
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while(true) {
				line = br.readLine();
				if(line==null)
					break;
				System.out.println("클라이언트로부터 수신: " + line);
				
				// 수신하자마자 Client한테 echo 전송
				pw.println(line);
				pw.flush();
			}
			System.out.println(inetAddr.getHostAddress() + " Client 종료");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}









