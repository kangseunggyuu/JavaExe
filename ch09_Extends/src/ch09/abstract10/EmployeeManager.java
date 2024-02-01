package ch09.abstract10;

import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100;
	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0;
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		return 0;
	}
	private RegularEmployee createRegularEmployee() {
		return null;
	}
	private TempEmployee createTempEmployee() {
		return null;
	}
	private PartTimeEmployee createPartyTimeEmployee() {
		return null;
	}
	private boolean saveEmployee(Employee emp) {
		return true;
	}
	private void viewAllEmployeeInfo() {
		
	}
	public void run() {
		
	}
}
