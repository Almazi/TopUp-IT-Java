import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal amount : ");
		int pricipal = scan.nextInt();
		System.out.println("Enter the annual interest rate :");
		int annualRate = scan.nextInt();
		annualRate = (pricipal/100)*annualRate;
		int monthlyRate = (annualRate / 12);
		
		System.out.println("Enter the no. of months : ");
		int numberOfMonth = scan.nextInt();
		Main m = new Main();
		m.balance(pricipal,monthlyRate,numberOfMonth);
	}
	public void balance(int pricipal, int monthlyRate, int numberOfMonth){
		double total = pricipal+(monthlyRate*numberOfMonth);
		System.out.println("Balance after 24 month(s) is : "+ total);
		
	
	}
}