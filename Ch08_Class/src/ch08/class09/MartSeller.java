package ch08.class09;

public class MartSeller {
	private int myMoney;
	final int PEAR_PRICE = 2500;
	
	public MartSeller(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void showSellerResult() {
		System.out.println("가진 돈: " + myMoney);
		System.out.println("구매한 배의 가격: " + PEAR_PRICE);
		System.out.println("거스름 돈: " + (myMoney - PEAR_PRICE));
	}
	
}
