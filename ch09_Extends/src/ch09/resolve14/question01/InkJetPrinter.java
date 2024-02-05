package ch09.resolve14.question01;

public class InkJetPrinter extends Printer {
	
	protected double inkRemainders;

	public InkJetPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, double inkRemainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemains);
		this.inkRemainders = inkRemainders;
	}

	@Override
	public void print() {
		super.print();		// 종이 1장 사용
		this.inkRemainders -= 0.1;
		this.printCount++;
		System.out.println("잉크가 잘 분사되어 출력된다.");
		System.out.println("품질이 양호하다.");
	}

	@Override
	public String toString() {
		return "InkJetPrinter [inkRemainders=" + inkRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}



}
