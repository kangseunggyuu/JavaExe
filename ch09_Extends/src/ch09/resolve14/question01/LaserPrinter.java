package ch09.resolve14.question01;

public class LaserPrinter extends Printer {

	protected double tonnerRemainders;
	
	public LaserPrinter(String modelName, String maunfactuer, P_INTERFACE pInterface, int printCount,
			int paperRemains, double tonnerRemainders) {
		super(modelName, maunfactuer, pInterface, printCount, paperRemains);
		this.tonnerRemainders = tonnerRemainders;
	}

	@Override
	public void print() {
		super.print();
		this.printCount++;
		this.tonnerRemainders *= 0.99;
		System.out.println("빠르게 출력된다.");
		System.out.println("품질이 매유 양호하다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [tonnerReminders=" + tonnerRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}
	
	
	
}
