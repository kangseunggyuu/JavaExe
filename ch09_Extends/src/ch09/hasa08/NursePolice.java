package ch09.hasa08;

public class NursePolice extends Police{
	
	private int thermometers;	// 체온계 개수
	
	public NursePolice(int clothes, int thermometers) {
		super(clothes);
		this.thermometers = thermometers;
	}
	public void calcThermometer() {
		if(thermometers > 0) {
			System.out.println("Check 36.5 Temp");
			thermometers--;			
		}else {
			System.out.println("No Check Temp");
		}

	}

}
