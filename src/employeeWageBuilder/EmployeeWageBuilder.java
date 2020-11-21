package employeeWageBuilder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeWageBuilder implements IComputeEmpWage {

		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
	
		private LinkedList<CompanyEmpWage> companyEmpWageList;
		private Map<String, CompanyEmpWage> companyToEmpWageMap;
		
	public EmployeeWageBuilder()
	{
		companyEmpWageList = new LinkedList<CompanyEmpWage>();
		companyToEmpWageMap = new HashMap<String, CompanyEmpWage>();
	}
	
	public void addCompanyEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
		CompanyEmpWage companyEmpWage =new CompanyEmpWage(company, EMP_RATE_PER_HOUR, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}
	
	public void computeEmpWage() {
		for(int i=0; i<companyEmpWageList.size(); i++)
		{
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
		while (totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day#: "+ totalWorkingDays + " EmpHrs: " +empHrs);
		}
		return totalEmpHrs*companyEmpWage.empRatePerHour;
	}
	
	public static void main(String[] args) {
		EmployeeWageBuilder empWageBuilder=new EmployeeWageBuilder();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();
	}
}