package ch18.fileio.charstream02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		// 문자 출력 스트림 연결
		Writer wt = new FileWriter("손흥민.txt");
		// 내부 저장소(버퍼) 필터 클래스
		BufferedWriter out = new BufferedWriter(wt);
		out.write("대한민국 국적의 토트넘 홋스퍼 FC 소속 축구 선수. 주 포지션은 윙어. 현재 토트넘 홋스퍼 FC와 대한민국 축구 국가대표팀의 주장을 맡고 있다.");
		out.newLine();  // 개행 문자 추가
		out.write("프리미어 리그와 UEFA 챔피언스 리그 아시아 선수 역대 최다 득점자이며 아시아 최초로 발롱도르 후보 30인[33]과 FIFA FIFPro 월드 XI 후보 55인[34]에 선정됐다. ");
		out.newLine();
		out.write("또한 FIFA 푸스카스상[35]을 수상했으며 프리미어 리그 이달의 선수에 4회 선정됐다.");
		out.newLine();
		out.write("아시아 선수 최초로 PFA 올해의 팀[36]에 선정됐고 프리미어 리그 통산 100골, PL 역사상 6명만이 존재하는 8시즌 연속 두 자릿 수 골 및 프리미어 리그 골든 부츠를 수상한 유일무이한 아시아 선수이다.");
		out.newLine();
		out.write("더불어 토트넘 역사상 최다 도움을 기록한 선수이기도 하다.");
		out.newLine();
		
		out.close();
		System.out.println("입력 완료");
	}
}





