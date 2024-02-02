package ch09.abstract11;

// 정규직 사원
public class RegularEmployee extends Employee{
	
	protected int yearSalary;	// 연봉
	protected int bonus;		// 보너스

	public RegularEmployee(String empno, String name,
						int yearSalary, int bonus) {
		super(empno, name);	// Employee(empno, name) 호출
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)(yearSalary+bonus)/12;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		// 부모의 기능 + 추가 확장
		super.showEmployeeInfo();	// Emplyee의 show~ 호출
		System.out.println("bonus : " + bonus);
		System.out.printf("monthPay : %.2f\n", getMonthPay());
	}

	
}




