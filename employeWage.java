//import java.lang.Math; 

public class employeWage {

	public static void main( String[] args) {
	//CONSTANTS
	int ISFULLTIME = 1;
	//Computation
	double empCheck = Math.floor(Math.random() * 10) % 2;
if (empCheck == ISFULLTIME)
	System.out.println("Employee is present..");
else
	System.out.println("Employee is abscent..");
}

}
