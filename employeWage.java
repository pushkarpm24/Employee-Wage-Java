
public class employeWage	{

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static String COMPANY_NAME;
	public static int EMP_RATE_PER_HR;
	public static int NUM_OF_WORKING_DAYS;
	public static int MAX_HRS_IN_MONTH;
	public static int TOTAL_EMP_WAGE;

	public employeWage(String COMPANY_NAME, int EMP_RATE_PER_HR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH)	{
		this.COMPANY_NAME = COMPANY_NAME;
		this.EMP_RATE_PER_HR = EMP_RATE_PER_HR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

	}

	public static String getCompanyName()	{
		return COMPANY_NAME;
	}

	public static int getTotalEmpWage()	{
		return TOTAL_EMP_WAGE;
	}

	public void totEmpWageComputation()	{
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
								TOTAL_EMP_WAGE = totalEmpHrs * EMP_RATE_PER_HR;
								System.out.println("Total Emp Wage of:" + getCompanyName() + "Employee is.." + getTotalEmpWage());

	}

	public static void main (String[] args) {
		//CREATING OBJECTS
		employeWage bridgelabs = new employeWage("bridgelabs",20,20,100);
		bridgelabs.totEmpWageComputation();

		employeWage capgemini = new employeWage("capgemini",50,20,10);
		capgemini.totEmpWageComputation();

	}


}

