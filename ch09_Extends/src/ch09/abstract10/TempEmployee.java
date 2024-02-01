package ch09.abstract10;

// 임시직 사원
public class TempEmployee extends Employee{
	
	protected int yearSalary;
	protected int hireYear;
	
	public TempEmployee(String empno, String name, int yearSalary, int hireYear) {
		super(empno, name);
		this.yearSalary = yearSalary;
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)yearSalary/12;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("yearSalary: " + yearSalary);
		System.out.println("hireYear: " + hireYear);
		System.out.println("monthPay: " + getMonthPay());
	}
	
	
	
}
