package employee;

import java.util.Random;

public class Employee {
//	Initialize object of Random Class
	Random random = new Random();
	
//	Initialize variables
	private final int WAGE_PER_HOUR = 20;
	private final int FULL_DAY_HOUR = 8;
	private final int HALF_DAY_HOUR = 4;
	public int dailyWage = 0;
	
//	Check Employee is Present or Absent
	public boolean isPresent() {
		boolean rand = random.nextBoolean();
		
		if (rand) {
			return true;
		
		} else {
			return false;
		}
	}

//	Calculate Daily Employee Wage
	public int dailyWage() {
		if (isPresent()) {
			dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
			return dailyWage;
			
		} else {
			dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
			return dailyWage;
		}
	}
	
}
