package calculateEmployeeWage;

import employee.Employee;

public class CalculateEmployeeWage {
//	Display Welcome Message....
	static {
		System.out.println("_________________Welcome to Employee Wage Computation_________________\n");
	}
	
	public static void main(String[] args) {
//		Calculate Employee Wage till it reached the condition Total-Working-Hour=100 OR Day=30
		new Employee().computeWages();
	}

}
