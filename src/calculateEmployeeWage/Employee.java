package calculateEmployeeWage;

import java.util.Random;

/**
 * 
 * @author AmitM
 *
 */

public class Employee {
//	Initialize object of Random Class
	Random random = new Random();

//	Initialize variables
	private final int FULL_DAY_HOUR = 8;
	private final int HALF_DAY_HOUR = 4;

	private String workStatus = null;
	private int dailyWage = 0;
	private int totalWage = 0;
	private int totalHour = 0;
	private int countDay = 0;
	private int day = 1;

	private String employeeName;
	private String companyName;
	private int wagePerHour;
	private int totalWorkingHours;
	private int totalWorkingDays;

	public Employee(String employeeName, String companyName, int wagePerHour, int totalWorkingHours,
			int totalWorkingDays) {
		super();
		this.employeeName = employeeName;
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.totalWorkingHours = totalWorkingHours;
		this.totalWorkingDays = totalWorkingDays;
		computeWages();
	}

//	Check Employee is Present or Absent
	private int isPresent() {
		int rand = random.nextInt(2);

		if (rand == 1) {
			return rand;

		} else {
			return rand;
		}
	}

//	Check Employee work status
	private void workStatus() {
		if (random.nextBoolean()) {
			workStatus = "Full-Time";

		} else {
			workStatus = "Part-Time";
		}
	}

//	Calculate Daily Employee Wage
	private void dailyWage() {
		workStatus();
		switch (workStatus) {
		case "Full-Time":
			dailyWage = wagePerHour * FULL_DAY_HOUR;
			totalWage += dailyWage;
			totalHour += FULL_DAY_HOUR;
			break;

		case "Part-Time":
			dailyWage = wagePerHour * HALF_DAY_HOUR;
			totalWage += dailyWage;
			totalHour += HALF_DAY_HOUR;
			break;

		default:
			System.out.println("Invalid Output!");
		}
	}

//	Calculate Wages for multiple companies
	private void computeWages() {
		System.out.println("Day \tAttendance \tWork Status \tDaily Wage \tTotal Wage");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		while (day<=totalWorkingDays && totalHour<=totalWorkingHours) {
			switch (isPresent()) {
			case 0:
				workStatus = "Null     ";
				dailyWage = 0;
				System.out.println(day + "\t Absent \t " + workStatus + "\t   " + dailyWage + "\t\t  " + totalWage);
				break;

			case 1:
				dailyWage();
				countDay++;
				System.out.println(day + "\t Present\t " + workStatus + "\t   " + dailyWage + "\t\t  " + totalWage);
				break;

			default:
				System.err.println("Invalid Operation!");
			}
			
			day++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\n" + employeeName + " You Work " + countDay + " Days of " + totalWorkingDays
				+ " Days in this Month for " + companyName + ".");
		System.out.println("\n" + employeeName + " You Work " + totalHour + " Hours of " + totalWorkingHours
				+ " Hours in this Month for " + companyName + ".");
		System.out.println(
				"\n" + "Total Wage of " + employeeName + " for this Month that to be paid is " + totalWage + "$");
	}

}
