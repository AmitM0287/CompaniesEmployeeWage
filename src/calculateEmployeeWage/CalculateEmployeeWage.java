package calculateEmployeeWage;

import employee.Employee;

public class CalculateEmployeeWage {
//	Display Welcome Message....
	static {
		System.out.println("_________________Welcome to Employee Wage Computation_________________\n");
	}
	
	public static void main(String[] args) {
//		Calculate Employee Wage for a Month
		new Employee().computeWages();
	}

}
