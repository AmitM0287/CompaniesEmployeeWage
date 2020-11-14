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
	public String workStatus="NULL";
	
//	Check Employee is Present or Absent
	public boolean isPresent() {
		boolean rand = random.nextBoolean();
		
		if (rand) {
			return true;
		
		} else {
			return false;
		}
	}

//	Check Employee work status
	private void workStatus() {
		if (isPresent()) {
			workStatus = "Full-Time";
			
		} else {
			workStatus = "Part-Time";
		}
	}
	
//	Calculate Daily Employee Wage
	public void dailyWage() {
		workStatus();
		switch(workStatus) {
			case "Full-Time" :
				dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
				break;
			
			case "Part-Time" :
				dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
				break;
			
			default :
				System.out.println("Invalid Output!");
		}
	}
	
}
