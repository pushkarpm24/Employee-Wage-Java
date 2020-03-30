

public class employeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int Emp_Rate_Per_Hr = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;

public static void main( String[] args) {

	wageDisplay();

}

static void wageDisplay()
{
   //Variables
   int empHrs = 0,totalEmpHrs = 0,totalWorkingDays = 0;
   //Computation
   while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
{
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
      int totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
      System.out.println("Total Emp Wage:" + totalEmpWage);


}

}

