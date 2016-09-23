import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Days worked by employer in a year : ");
		int daysWorked = scan.nextInt();
		System.out.println("Enter the no. of working hours in a day : ");
		int hoursWorked = scan.nextInt();
		System.out.println("Enter the no. of hours worked in over time : ");
		int hoursOverTime = scan.nextInt();
		System.out.println("Enter the no. of hours took leave : ");
		int hoursTookLeave = scan.nextInt();
		float income = ((daysWorked*hoursWorked) - hoursTookLeave + hoursOverTime)*12;
		
		System.out.println("Gross Pay (in $) : " + income);
		Main m = new Main();
		m.calculateTax(income);
		
		
		
	}
	
	public void calculateTax(float income){
		float tax = income*15/100;
		System.out.println("Tax (in $) : " + tax);
		DefinecalculateNetPay(income, tax);

	}
	
	public void DefinecalculateNetPay(float income, float tax){
		float netPay = income - tax;
		System.out.println("Net Pay (in $) : " + netPay);

	}
}