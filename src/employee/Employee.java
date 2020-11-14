package employee;

import java.util.Random;

public class Employee {
//	Initialize object of Random Class
	Random random = new Random();
	
//	Initialize variables
	private final int WAGE_PER_HOUR = 20;
	private final int FULL_DAY_HOUR = 8;
	private final int HALF_DAY_HOUR = 4;
	private int dailyWage = 0;
	private String workStatus=null;
	private int totalWage = 0;
	private int totalHour = 0;
	private int day = 1;
	
//	Check Employee is Present or Absent
	private boolean isPresent() {
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
	private void dailyWage() {
		workStatus();
		switch(workStatus) {
			case "Full-Time" :
				dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
				totalWage += dailyWage;
				totalHour += FULL_DAY_HOUR;
				break;
			
			case "Part-Time" :
				dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
				totalWage += dailyWage;
				totalHour += HALF_DAY_HOUR;
				break;
			
			default :
				System.out.println("Invalid Output!");
		}
	}
	
//	Calculate Wages till it reached the condition Total-Working-Hour=100 OR Day=30
	public void computeWages() {
		System.out.println("Day \tAttendance \tWork Status \tDaily Wage \tTotal Wage");
		
		while (totalHour!=100 && day<=30) {
			if (isPresent()) {
				dailyWage();
				System.out.println(day + "\t Present\t " + workStatus + "\t   " + dailyWage + "\t\t  " + totalWage);
				
			} else {
				workStatus = "Null     ";
				dailyWage = 0;
				System.out.println(day + "\t Absent \t " + workStatus + "\t   " + dailyWage + "\t\t  " + totalWage);
			}
			day ++;
		}
		System.out.println("\nTotal Working Day = " + (day-1) + " Day");
		System.out.println("Total Working Hour = " + totalHour + " Hour");
		System.out.println("Total Employee Wage = " + totalWage);
	}

}
