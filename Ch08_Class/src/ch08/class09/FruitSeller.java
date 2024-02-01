package ch08.class09;

public class FruitSeller {
	private int numOfApple;			// 사과개수
	private int saleMoney;			// 판매금액
	final int APPLE_PRICE = 1000;	// 사과가격
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public int saleApple(FruitBuyer buyer, int money) {
		int num = buyer.buyApple(money);
		numOfApple -= num;
		saleMoney +=  money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + saleMoney);
	}
}



