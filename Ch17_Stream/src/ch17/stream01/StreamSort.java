package ch17.stream01;

import java.util.ArrayList;
import java.util.List;

/* [스트림의 장점]
 * 1) 자료의 대상과 관계 없이 동일한 연산을 수행
 * (사용법을 일관되게)
 * 2) 한 번 생성하고 사용한 스트림은 재사용할 수 없다.
 * 3) 스트림의 련산으 기존 자료를 변경하지 않는다.
 * 4) 스트림의 연산은 중간연산과 최종연산이 있다.
 * 	  중간연산이 호출되어도 최정 연산이 호출되지 않으면
 *    결과를 가져올 수 없다.(자연연산(Lazy evaluation))
 *    최종연산이 호출되어야 비로소 연산이 시작된다.
 * */

public class StreamSort {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Tomas");
		nameList.add("Edward");
		nameList.add("Jack");
		
		nameList.stream().sorted().forEach(s->System.out.println(s));
	}
}
