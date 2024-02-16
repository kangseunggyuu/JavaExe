package ch17.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCalc {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("알렉산드라");
		nameList.add("톨스토이");
		nameList.add("루저외톨이센척하는겁쟁이삼천갑자동방삭");
		nameList.add("Cristoper");
		nameList.add("라스무스 호일룬");
		nameList.add("브루누 페르난데스");
		nameList.add("마커스 래시포드");
		nameList.add("알레한드로 가르나초");
		nameList.add("안드레 오나나");
		
		for(String name : nameList) {
			if(name.length() >= 5) {
				System.out.print(name + ", ");
			}
		}
		
		System.out.println();
		
		Stream<String> strm = nameList.stream();
		Stream<String> StrmF = strm.filter(s->s.length() >= 5);
		System.out.println();
			
		nameList.stream()					// 1) 스트림 객체
				.filter(s->s.length() >= 5)	// 2) 중간연산(참일 때 새로운 스트림)
				.filter(s->s.length() < 10)
				.forEach(s->System.out.print(s + ", "));	// 3) 최종연산
	}
}
