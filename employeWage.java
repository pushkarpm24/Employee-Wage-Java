

public class employeWage {

	public static void main( String[] args) {
	//CONSTANTS
	int IS_PART_TIME = 1;
	int IS_FULL_TIME = 2;
	int Emp_Rate_Per_Hr = 20;
	//Variables
	int empHrs = 0;
	int empWage = 0;
	//Computation
	double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;

		empWage = empHrs * Emp_Rate_Per_Hr;
		System.out.println("Emp Wage:" + empWage);

}

}
