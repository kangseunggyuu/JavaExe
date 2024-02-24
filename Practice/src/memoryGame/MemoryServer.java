package memoryGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import Server.Game;

public class MemoryServer implements Game {
	private Socket socket;
	
	@Override
	public void start(Socket socket) {
		this.socket = socket;
		new clientInfo(socket).start(); // 클라이언트 연결을 처리하는 쓰레드 시작
		
		MemoryGame.main(null);	
	}

	public class clientInfo extends Thread {
		private Socket socket; // 클라이언트 소켓을 받아서 사용하는 변수
		public PrintWriter writer; // 쓰기 버퍼.
		private BufferedReader reader; // 읽기 버퍼.
		public String memoryMsg; // 클라이언트 아이디를 담는 변수.
		public String gamename; // 클라이언트가 선택한 게임 이름

		public clientInfo(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(), true);

				String clientMsg;
				while ((clientMsg = reader.readLine()) != null) {
					String[] parsedMsg = clientMsg.split("&");
					// Client Thread에서 동작하는 프로토콜
					handleProtocol(parsedMsg);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void handleProtocol(String[] parsedMsg) {
			if (parsedMsg.length >= 2) {
				String protocol = parsedMsg[0];
				String data = parsedMsg[1];

				switch (protocol) {
				case "memory":
					memoryMsg = data;
					// clientIds.put(socket, clientId);
					System.out.println(memoryMsg + "확인");
					break;

				}
			}
		}
	}

	public void startgame() {
		new MemoryGame();
		
	}

}