

public class employeWage	{

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static int EMP_RATE_PER_HR;
	public static int NUM_OF_WORKING_DAYS;
	public static int MAX_HRS_IN_MONTH;

	public employeWage(int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH)	{
		this.EMP_RATE_PER_HR = EMP_RATE_PER_HR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

	}

	public int totEmpHrComputation()	{
   	//Variables
   	int empHrs = 0,totalEmpHrs = 0,totalWorkingDays = 0;
   		//Computation
   		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)	{
   				totalWorkingDays++;
   				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
   					switch (empCheck)
   					{
      						case IS_FULL_TIME:
            							empHrs = 8;
            							break;
      						case IS_PART_TIME:
            							empHrs = 4;
            							break;
      						default:
            							empHrs = 0;
   					}

      						totalEmpHrs += empHrs;
      						System.out.println("Day#" + totalWorkingDays + "Emp hrs" + empHrs);
		}
      						return totalEmpHrs;


	}

	public void totEmpWageComputation(int totalEmpHrs)	{
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
		System.out.println("Total Emp Wage:" + totalEmpWage);

	}

	public static void main (String[] args) {
		//CREATING OBJECTS
		employeWage company1 = new employeWage(20,20,100);
		int comp1totalEmpHrs = company1.totEmpHrComputation();
		company1.totEmpWageComputation(comp1totalEmpHrs);

		employeWage company2 = new employeWage(50,20,10);
		int comp2totalEmpHrs = company2.totEmpHrComputation();
		company2.totEmpWageComputation(comp2totalEmpHrs);

	}


}

