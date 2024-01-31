package ch08.class09;

public class PearSeller {

	public int NumOfPear;			//배 개수
	public int SalePear;			//판매 금액
	public int PEAR_PRICE = 2500;	//배 가격
	public int Remain;				//거스름돈
	
	public PearSeller(int NumOfPear) {
		this.NumOfPear = NumOfPear;
	}
	
	public void SalePear(int money) {
		int num = money/PEAR_PRICE;
		NumOfPear -= num;
	}
}
