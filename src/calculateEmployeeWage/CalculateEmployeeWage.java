package calculateEmployeeWage;

import employee.Employee;

public class CalculateEmployeeWage {
//	Display Welcome Message....
	static {
		System.out.println("___________Welcome to Employee Wage Computation___________");
	}
	
	public static void main(String[] args) {
//		Initialize object of Employee Class
		Employee emp = new Employee();
		
//		Display Employee is Present or Absent
		if (emp.isPresent()) {
			System.out.println("Employee is Present!");
			
		} else {
			System.out.println("Employee is Absent!");
		}
	}

}
