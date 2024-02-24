package memoryGame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class MemoryGame extends JFrame implements ActionListener {

    private final int BOARD_SIZE = 4; // 보드 크기
    private final int CARD_SIZE = 100; // 카드 크기
    private List<ImageIcon> symbols; // 카드에 표시될 이미지 목록
    private List<CardButton> buttons; // 카드 버튼 목록
    private CardButton firstCard; // 첫 번째 선택한 카드
    private CardButton secondCard; // 두 번째 선택한 카드
    private long startTime; // 게임 시작 시간

    public MemoryGame() {
        setTitle("Memory Game"); // JFrame 창 이름 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame 종료 시 프로그램 종료
        setSize(BOARD_SIZE * CARD_SIZE, BOARD_SIZE * CARD_SIZE); // JFrame 크기 설정
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE)); // 보드에 GridLayout 적용

        symbols = generateSymbols(); // 이미지 목록 생성
        buttons = new ArrayList<>(); // 카드 버튼 목록 초기화

        // 카드 버튼 생성 및 패널에 추가
        for (int i = 0; i < BOARD_SIZE * BOARD_SIZE; i++) {
            CardButton button = new CardButton();
            button.addActionListener(this); // 카드 버튼에 ActionListener 등록
            buttons.add(button); // 카드 버튼을 목록에 추가
            add(button); // 카드 버튼을 패널에 추가
        }

        startGame(); // 게임 시작
    }

    // 이미지 목록 생성
    private List<ImageIcon> generateSymbols() {
        List<ImageIcon> symbols = new ArrayList<>();
        for (int i = 1; i <= (BOARD_SIZE * BOARD_SIZE) / 2; i++) {
            ImageIcon image = new ImageIcon("memoryimage/image" + i + ".png"); // 이미지 경로 설정
            symbols.add(image);
            symbols.add(image); // 이미지를 두 번씩 추가하여 쌍을 이룸
        }
        Collections.shuffle(symbols); // 이미지 목록을 섞음
        return symbols; // 섞인 이미지 목록 반환
    }

    // 게임 시작
    private void startGame() {
        startTime = System.currentTimeMillis(); // 게임 시작 시간 기록
        for (int i = 0; i < BOARD_SIZE * BOARD_SIZE; i++) {
            buttons.get(i).setImage(symbols.get(i)); // 카드 버튼에 이미지 설정
            buttons.get(i).setMatched(false); // 카드 버튼을 매치되지 않은 상태로 초기화
            buttons.get(i).setVisible(true); // 카드 버튼을 보이도록 설정
        }
    }

    // 카드 버튼 클릭 시 호출됨
    @Override
    public void actionPerformed(ActionEvent e) {
        CardButton clickedCard = (CardButton) e.getSource(); // 이벤트 발생한 카드 버튼 가져오기

        if (!clickedCard.isMatched()) { // 클릭한 카드가 매치되지 않은 상태인 경우에만 실행
            if (firstCard == null) { // 첫 번째 선택한 카드인 경우
                firstCard = clickedCard; // 첫 번째 선택한 카드로 설정
                firstCard.setIcon(firstCard.getImage()); // 카드의 이미지를 보이도록 설정
            } else if (secondCard == null && clickedCard != firstCard) { // 두 번째 선택한 카드인 경우
                secondCard = clickedCard; // 두 번째 선택한 카드로 설정
                secondCard.setIcon(secondCard.getImage()); // 카드의 이미지를 보이도록 설정

                // 두 카드가 일치하는지 확인
                if (firstCard.getImage() == secondCard.getImage()) { // 두 카드의 이미지가 일치하는 경우
                    firstCard.setMatched(true); // 첫 번째 카드를 매치됨으로 설정
                    secondCard.setMatched(true); // 두 번째 카드를 매치됨으로 설정
                    firstCard.setEnabled(false); // 첫 번째 카드 비활성화
                    secondCard.setEnabled(false); // 두 번째 카드 비활성화
                }

                // 0.5 초 후에 카드 가리기
                Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstCard.setIcon(null); // 첫 번째 카드 이미지 가리기
                        secondCard.setIcon(null); // 두 번째 카드 이미지 가리기
                        firstCard = null; // 첫 번째 카드 초기화
                        secondCard = null; // 두 번째 카드 초기화
                    }
                });
                timer.setRepeats(false); // 타이머 반복 실행 비활성화
                timer.start(); // 타이머 시작
            }
        }

        // 모든 카드가 매치되었는지 확인
        boolean allMatched = true;
        for (CardButton button : buttons) {
            if (!button.isMatched()) {
                allMatched = false;
                break;
            }
        }
        if (allMatched) { // 모든 카드가 매치된 경우
            long endTime = System.currentTimeMillis(); // 게임 종료 시간 기록
            long elapsedTime = endTime - startTime; // 소요된 시간 계산
            double seconds = elapsedTime / 1000.0; // 밀리초를 초로 변환
            JOptionPane.showMessageDialog(this, "와~~ " + seconds + " 초 걸렸습니다! 짝짝짝.."); // 완료 메시지 표시
            dispose(); // JFrame 닫기
        }
    }

    public static void main(String[] args) {
        // 스윙 컴포넌트를 생성하고 수정하는 작업은 이벤트 디스패치 스레드에서 실행되어야 함
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MemoryGame game = new MemoryGame(); // 메모리 게임 인스턴스 생성
                game.setVisible(true); // 게임 화면 표시
            }
        });
    }

}

// 카드 버튼 클래스
class CardButton extends JButton {
    private ImageIcon image; // 카드 이미지
    private boolean matched; // 매치 여부

    // 카드 버튼 생성자
    public CardButton() {
        super();
        setPreferredSize(new Dimension(100, 100)); // 카드 버튼 크기 설정
    }

    // 이미지 getter
    public ImageIcon getImage() {
        return image;
    }

    // 이미지 setter
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    // 매치 여부 getter
    public boolean isMatched() {
        return matched;
    }

    // 매치 여부 setter
    public void setMatched(boolean matched) {
        this.matched = matched;
    }
}
