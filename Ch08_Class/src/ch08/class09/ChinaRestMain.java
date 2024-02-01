package ch08.class09;

//2. 중화요리집을 임의대로 클래스로 만드세요

public class ChinaRestMain {

	public static void main(String[] args) {
		ChinaRest chrest = new ChinaRest();
		
		chrest.ViewMenu();
		chrest.SelectMenu();
		chrest.DeliveryFoods();
		chrest.KeyboardOut();
		

	}

}
