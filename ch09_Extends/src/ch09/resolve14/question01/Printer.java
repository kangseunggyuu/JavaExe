package ch09.resolve14.question01;

public class Printer {
	protected String modelName;
	protected String manufacturer;
	protected P_INTERFACE pInterface;
	protected int printCount;
	protected int paperRemains;
	
	public Printer(String modelName, String maunfactuer, P_INTERFACE pInterface, int printCount, int paperRemains) {
		this.modelName = modelName;
		this.manufacturer = maunfactuer;
		this.pInterface = pInterface;
		this.printCount = printCount;
		this.paperRemains = paperRemains;
	}
	
	public void print() {
		this.paperRemains--;
	}

	@Override
	// toString은 필드 정보를 보는데 사용
	public String toString() {
		return "Printer [modelName=" + modelName + ", maunfactuer=" + manufacturer + ", pInterface=" + pInterface
				+ ", printCount=" + printCount + ", paperRemains=" + paperRemains + "]";
	}
	
}
