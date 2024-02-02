package ch09.interface13.order01;

import ch09.interface13.ICar;

public class CarTester {
	private final int TEST_NUM = 3;
	private ICar car;
	
	/* 외부에서 주입
	 * CarTest는 ICar에 의존적이다.
	 */
	public CarTester(ICar car) {
		this.car = car;
	}
	public void setCar(ICar car) {
		this.car = car;
	}
	public void onOffTest() {
		for(int i=0;i<TEST_NUM;i++) {
			car.turnOn();
			car.turnOff();			
		}
	}
	
}







