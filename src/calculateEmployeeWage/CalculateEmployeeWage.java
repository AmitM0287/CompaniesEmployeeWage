package calculateEmployeeWage;

import java.util.Scanner;

/**
 * 
 * @author AmitM
 *
 */

public class CalculateEmployeeWage {
//	Display Welcome Message....
	static {
		System.out.println("\n____________Welcome to Employee Wage Computation Program____________\n");
	}

//	Initialize variables
	static String employeeName;
	static String companyName;
	static int wagePerHour;
	static int totalWorkingHours;
	static int totalWorkingDays;

	static void getCompnayDetails() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Your Name : ");
			employeeName = sc.nextLine();

			System.out.print("\nEnter Your Company Name : ");
			companyName = sc.nextLine();

			System.out.print("\nEnter WAGE_PER_HOUR of " + companyName + " ( $ ): ");
			wagePerHour = sc.nextInt();

			System.out.print("\nEnter TOTAL_WORKING_DAYS for a Month of " + companyName + " (Days) : ");
			totalWorkingDays = sc.nextInt();

			System.out.print("\nEnter TOTAL_WORKING_HOUR for a Month of " + companyName + " (Hours) : ");
			totalWorkingHours = sc.nextInt();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		Compute Employee Wage for multiple companies
		getCompnayDetails();
		System.out.println("\n_________Calculating " + employeeName + "'s Total Wage of " + companyName + " for this Month_________\n");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Employee(employeeName, companyName, wagePerHour, totalWorkingHours, totalWorkingDays);
	}

}
