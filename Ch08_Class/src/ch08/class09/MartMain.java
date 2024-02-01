package ch08.class09;

//3. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
//클래스로 설계해서 프로그래밍 하세요

public class MartMain {

	public static void main(String[] args) {
		MartSeller seller = new MartSeller(5000);
		
		seller.showSellerResult();
	}

}
