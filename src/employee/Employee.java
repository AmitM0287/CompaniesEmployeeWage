package employee;

import java.util.Random;

public class Employee {
//	Initialize object of Random Class
	Random random = new Random();
	
//	Check Employee is Present or Absent
	public boolean isPresent() {
		boolean rand = random.nextBoolean();
		
		if (rand) {
			return true;
		
		} else {
			return false;
		}
	}

}
