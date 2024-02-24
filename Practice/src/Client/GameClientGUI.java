package Client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import baseballGame.BaseballGame;
import memoryGame.MemoryGame;
import omokGame.OmokClient;

public class GameClientGUI extends JFrame {
	// 폰트 파일 경로
	String fontFilePath = "Font/BagelFatOne-Regular.ttf";
	Font customFont;

	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

	// 서버
	String server = "192.168.0.53";// 서버IP
	int serverPort = 12345; // 임의 포트

	// 통신
	private Socket socket;
	private PrintWriter writer;
	private BufferedReader reader;

	// 클라이언트가 입력한 아이디값
	private String IDString;
	private String GameName;

	// 게임배경
	private MainPanel mainJPanel; // 게임배경

	// 게임시작
	private JPanel gameStartJPanel; // 게임 시작화면
	private JButton gameStartbtn; // 게임 시작 버튼
	private ImageIcon gameStarticon; // 게임 시작 버튼 아이콘

	// 아이디입력
	private JPanel gameIdJPanel; // 아이디 입력 화면
	private ImageIcon Idinputmsg;
	private JLabel IdinputJLabel;// "닉네임을 입력하세요"
	private ImageIcon namefield_;
	private JLabel namefield_Label; // 닉네임 입력하는 곳 밑줄
	private JTextField IdinputField; // 사용자가 닉네임을 입력하는 필드
	private ImageIcon Idinputicon;
	private JButton Idinputbtn;// 게임 시작 버튼

	// 게임선택
	private JPanel gameSelectJPanel; // 게임 선택화면
	private ImageIcon gameselecticon;
	private JLabel gameSelectMsg;// "게임을 선택하세요"
	// 게임선택버튼들
	private ImageIcon memoryIcon;
	private JButton selectMemoryBtn; // 메모리게임 선택버튼
	private ImageIcon memorytxtIcon;
	private JLabel memorytxt;// 메모리 text
	private ImageIcon omokIcon;
	private JButton selectOmokBtn; // 오목게임 선택버튼
	private ImageIcon omoktxtIcon;
	private JLabel omoktxt;// 오목 text
	private ImageIcon baseballIcon;
	private JButton selectBaseballBtn; // 숫자야구게임 버튼
	private ImageIcon baseballtxtIcon;
	private JLabel baseballtxt;// 야구 text

	// 생성자
	public GameClientGUI() {
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontFilePath));
			ge.registerFont(customFont);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		init(); // 초기화 메서드 먼저 호출
		batch(); // 배치 메서드 호출
		setting(); // 세팅 메서드 호출
		listener(); // 리스너 메서드 호출
		setVisible(true);
	}

	// 생성

	private void init() {
		setSize(700, 700);
		// 게임배경
		mainJPanel = new MainPanel();
		mainJPanel.setBackground(new Color(0, 0, 0));

		// 게임시작화면
		gameStartJPanel = new JPanel();
		gameStartJPanel.setBackground(new Color(228, 227, 255));
		gameStarticon = new ImageIcon(getClass().getResource("/Client/images/gamestartbtn0.png"));
		gameStartbtn = new JButton(gameStarticon);

		// 닉네임입력 화면
		gameIdJPanel = new JPanel();
		gameIdJPanel.setBackground(new Color(228, 227, 255));
		Idinputmsg = new ImageIcon(getClass().getResource("/Client/images/nameinputimg.png"));
		IdinputJLabel = new JLabel(Idinputmsg);
		namefield_ = new ImageIcon(getClass().getResource("/Client/images/__.png"));
		namefield_Label = new JLabel(namefield_);
		IdinputField = new JTextField(30);
		Idinputicon = new ImageIcon(getClass().getResource("/Client/images/nameinputbtn.png"));
		Idinputbtn = new JButton(Idinputicon);

		// 게임선택화면(라이어, 빙고, 오목 중 한가지 선택하는 버튼구현)
		gameSelectJPanel = new JPanel();
		gameSelectJPanel.setBackground(new Color(228, 227, 255));
		gameselecticon = new ImageIcon(getClass().getResource("/Client/images/gameselectmsg.png"));
		gameSelectMsg = new JLabel(gameselecticon);

		// 메모리게임버튼
		memoryIcon = new ImageIcon(getClass().getResource("/Client/images/memorygame.png"));
		selectMemoryBtn = new JButton(memoryIcon);
		memorytxtIcon = new ImageIcon(getClass().getResource("/Client/images/memorytxt.png"));
		memorytxt = new JLabel(memorytxtIcon);

		// 오목게임버튼
		omokIcon = new ImageIcon(getClass().getResource("/Client/images/omokgame.png"));
		selectOmokBtn = new JButton(omokIcon);
		omoktxtIcon = new ImageIcon(getClass().getResource("/Client/images/omoktxt.png"));
		omoktxt = new JLabel(omoktxtIcon);

		// 야구게임버튼
		baseballIcon = new ImageIcon(getClass().getResource("/Client/images/baseballgame.png"));
		selectBaseballBtn = new JButton(baseballIcon);
		baseballtxtIcon = new ImageIcon(getClass().getResource("/Client/images/baseballtxt.png"));
		baseballtxt = new JLabel(baseballtxtIcon);

	}

	// 위치 등등 세팅
	private void setting() {
		setTitle("게임서버");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(null);
		setContentPane(mainJPanel);

		// 게임시작화면
		gameStartJPanel.setLayout(null);
		gameStartJPanel.setBounds(165, 140, 380, 240);
		gameStartbtn.setBounds(50, 55, 270, 110);
		gameStarticon = ImageSetSize(gameStarticon, 360, 130);
		gameStartbtn.setVisible(true);
		gameStartJPanel.setVisible(true);// 시작때 화면 표시

		// 닉네임 입력 화면
		gameIdJPanel.setLayout(null);
		gameIdJPanel.setBounds(165, 140, 380, 240);
		IdinputJLabel.setBounds(15, 35, 350, 50);
		namefield_Label.setBounds(40, 140, 240, 80);
		IdinputField.setBounds(50, 105, 250, 80);
		IdinputField.setOpaque(false);// 입력창 투명하게
		IdinputField.setBackground(new Color(0, 0, 0, 0));
		IdinputField.setBorder(null);
		IdinputField.setFont(customFont.deriveFont(Font.PLAIN, 40)); // 폰트설정
		Idinputbtn.setBounds(290, 105, 80, 80);
		Idinputbtn.setOpaque(false);// 버튼 투명하게
		Idinputbtn.setContentAreaFilled(false);
		Idinputbtn.setBorderPainted(false);
		gameIdJPanel.setVisible(false); // 시작 시에는 화면에 표시되지 않도록 설정

		// 게임선택화면
		gameSelectJPanel.setLayout(null);
		gameSelectJPanel.setBounds(165, 140, 380, 240);
		gameSelectMsg.setBounds(43, 15, 300, 50);

		selectMemoryBtn.setBounds(13, 80, 110, 110);
		selectMemoryBtn.setOpaque(false);// 버튼 투명하게
		selectMemoryBtn.setContentAreaFilled(false);
		selectMemoryBtn.setBorderPainted(false);
		memorytxt.setBounds(16, 190, 110, 30);

		selectOmokBtn.setBounds(140, 79, 110, 110);
		selectOmokBtn.setOpaque(false);// 버튼 투명하게
		selectOmokBtn.setContentAreaFilled(false);
		selectOmokBtn.setBorderPainted(false);
		omoktxt.setBounds(140, 190, 110, 30);

		selectBaseballBtn.setBounds(262, 80, 110, 110);
		selectBaseballBtn.setOpaque(false);// 버튼 투명하게
		selectBaseballBtn.setContentAreaFilled(false);
		selectBaseballBtn.setBorderPainted(false);
		baseballtxt.setBounds(262, 190, 110, 30);

		gameSelectJPanel.setVisible(false); // 시작 시에는 화면에 표시되지 않도록 설정
	}

	// 화면에 배치
	private void batch() {
		mainJPanel.setLayout(null);
		mainJPanel.add(gameStartJPanel);
		mainJPanel.add(gameIdJPanel);
		mainJPanel.add(gameSelectJPanel);

		gameStartJPanel.add(gameStartbtn);
		gameStartbtn.setIcon(gameStarticon);

		gameIdJPanel.add(IdinputJLabel);
		gameIdJPanel.add(namefield_Label);
		gameIdJPanel.add(IdinputField);
		gameIdJPanel.add(Idinputbtn);

		gameSelectJPanel.add(gameSelectMsg);
		gameSelectJPanel.add(selectMemoryBtn);
		gameSelectJPanel.add(selectOmokBtn);
		gameSelectJPanel.add(selectBaseballBtn);
		gameSelectJPanel.add(memorytxt);
		gameSelectJPanel.add(omoktxt);
		gameSelectJPanel.add(baseballtxt);
	}

	// 버튼 클릭 이벤트
	private void listener() {
		// 게임시작버튼 눌렀을때
		gameStartbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				gameIdJPanel.setVisible(true); // gameIdJPanel 활성화
				gameStartJPanel.setVisible(false); // gameStartJPanel 비활성화
			}
		});

		// 닉네임 작성 후 입장버튼눌렀을때 -> Id가 서버에 전달
		Idinputbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JButton gameStartBtn = (JButton) e.getSource();
				connectServer(); // 서버에 연결
				sendInsertId(); // 입력받은 아이디 서버에 전달
			}
		});

		// 메모리게임 선택!
		selectMemoryBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameName = "memory";
//				sendSelectgame(GameName);
				MemoryGame memoryGame = new MemoryGame();
//				MemoryGame.main(null);
			}
		});

		// 오목게임 선택!
		selectOmokBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameName = "omok";
				sendSelectgame(GameName);
				OmokClient omokClient = new OmokClient(socket);
			}
		});

		// 숫자 야구 게임 선택!
		selectBaseballBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameName = "baseball";
				sendSelectgame(GameName);
				BaseballGame baseball = new BaseballGame(socket);
			}
		});
	}

	// 접속 시 서버 연결 메서드.
	private void connectServer() {
		try {
			socket = new Socket(server, serverPort);
		} catch (Exception e) {
			System.out.println(server + ": 서버 연결 실패");
		}
	}

	// ID를 서버에 전달하는 메소드
	private void sendInsertId() {
		try {
			writer = new PrintWriter(socket.getOutputStream(), true);
			IDString = IdinputField.getText();
			if ((IDString.equals(""))) { // NULL값 입력시
				IDString = Integer.toString(socket.hashCode());
				writer.println("ID&" + IDString);
				gameSelectJPanel.setVisible(true); // gameSelectJPanel 활성화
				gameIdJPanel.setVisible(false); // startJPanel 비활성화

			} else { // 아이디 값 입력시.
				writer.println("ID&" + IDString);
				IdinputField.setText("");
				gameSelectJPanel.setVisible(true); // gameSelectJPanel 활성화
				gameIdJPanel.setVisible(false); // startJPanel 비활성화

			}

		} catch (IOException e) {
			System.out.println(server + ": 준비 메세지 요청 실패");
		}
	}

	// 게임을 선택하고 선택한 게임을 서버에 보내는 메소드
	private void sendSelectgame(String gamename) {
		writer.println("gamename&" + gamename);
	}

	// 이미지 아이콘 크기 조절 메소드
	private ImageIcon ImageSetSize(ImageIcon icon, int width, int heigth) {
		Image xImage = icon.getImage();
		Image yImage = xImage.getScaledInstance(width, heigth, Image.SCALE_SMOOTH);
		ImageIcon xyImage = new ImageIcon(yImage);
		return xyImage;
	}

	// 이미지 삽입 패널 클래스(게임배경)
	class MainPanel extends JPanel {
		private ImageIcon icon = new ImageIcon(getClass().getResource("/Client/images/gamemainbg.png"));
		private Image imgMain = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgMain, 0, 0, getWidth(), getHeight(), null);
		}
	}

	public static void main(String[] args) {
		new GameClientGUI();
	}
}