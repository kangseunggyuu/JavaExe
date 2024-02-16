package ch17.stream02;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<>();				
		customerList.add(new TravelCustomer("홍길동", 24, 100));
		customerList.add(new TravelCustomer("임꺽정", 33, 100));
		customerList.add(new TravelCustomer("일지매", 15, 50));
		
		System.out.println("==고객 명단 추가된 순서대로 출력===");
		customerList.stream()
					.map(c->c.getName())
					.forEach(s->System.out.print(s + ", "));
		System.out.println();
		
		int total = customerList.stream()
								.mapToInt(c->c.getPrice())
								.sum();
		System.out.println("==총 여행 비용은 : " + total);
		
		System.out.println("==20세 이상 고객 명단 정렬하여 출력==");
		customerList.stream()
					.filter(c->c.getAge() >= 20)
					.map(c->c.getName())
					.sorted()
					.forEach(s->System.out.print(s + ", "));
	}
}
