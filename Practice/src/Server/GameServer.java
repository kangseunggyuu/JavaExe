package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseballGame.BaseballServer;
import exgame.exgameserver;
import memoryGame.MemoryServer;
import omokGame.OmokServer;

public class GameServer {
	private Map<String, List<Socket>> gameClients; // 클라이언트들의 소켓을 저장하는 리스트
	private Map<Socket, String> clientIds; // 클라이언트별 아이디를 저장하는 맵
	private Map<String, Game> games;// 게임이름과 해당 게임을 매핑하는 맵
	private ServerSocket serverSocket; // 서버 소켓.
	private static Socket clientsocket; // 클라이언트가 접속하면 새로 만드는 소켓

	public GameServer() {
		gameClients = new HashMap<>();
		clientIds = new HashMap<>();
		games = new HashMap<String, Game>();
		games.put("memory", new MemoryServer());
		games.put("omok", new OmokServer());
		games.put("ex", new exgameserver());
		games.put("baseball", new BaseballServer());

	}

	// TODO : 까불지않기!!

	// 게임서버를 시작하는 메소드
	public void startServer(int port) {
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버 시작. port : " + port + "...");

			while (true) {
				clientsocket = serverSocket.accept(); // 서버의 접속을 대기중
				System.out.println("클라이언트 연결 : " + clientsocket);

				// 클라이언트 처리를 위한 쓰레드 시작
				clientInfo CI = new clientInfo(clientsocket);
				CI.start();
			}
		} catch (Exception e) {
			System.out.println("게임서버 연결안됨.");
		}
	}

	public class clientInfo extends Thread {
		private Socket socket; // 클라이언트 소켓을 받아서 사용하는 변수
		public PrintWriter writer; // 쓰기 버퍼.
		private BufferedReader reader; // 읽기 버퍼.
		public String clientId; // 클라이언트 아이디를 담는 변수.
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
					// 받은 클래스 이름을 실행하고 결과를 클라이언트에게 다시 전송
					PrintWriter out = new PrintWriter(clientsocket.getOutputStream());
					out.println("서버에서 실행된 결과");

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private void handleProtocol(String[] parsedMsg) throws IOException {
			if (parsedMsg.length >= 2) {
				String protocol = parsedMsg[0];
				String data = parsedMsg[1];

				switch (protocol) {
				case "ID":
					clientId = data;
					clientIds.put(socket, clientId);
					System.out.println(clientId + "들어옴");

					// notifyClients(clientId + " is enter the room.", "ID");
					// sendClientList();
					break;
				case "gamename":
					System.out.println(clientId + "님이 " + data + "게임을 선택하셨습니다.");
					startGame(data, socket); // 클라이언트의 소켓 정보 전달
					break;

				// Handle other protocols
				}
			}
		}
	}

	// 사용자가 선택한 게임 시작 메소드
	public void startGame(String gameName, Socket clientSocket) {
		Game selectedGame = games.get(gameName.toLowerCase());
		if (selectedGame != null) {
			selectedGame.start(clientSocket);
			List<Socket> clients = gameClients.computeIfAbsent(gameName, k -> new ArrayList<>());
			clients.add(clientSocket);
		} else {
			System.out.println("게임이름을 잘못입력하셨습니다.");
			
		}
	}

	public static void main(String[] args) {
		GameServer gameServer = new GameServer();
		gameServer.startServer(4001);

	}

}