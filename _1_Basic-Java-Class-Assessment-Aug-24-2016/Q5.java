import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of attendees per show : ");
		int attendee = scan.nextInt();
		Main m = new Main();
		m.calculateTotalProfit(attendee);
	}
	
	public void calculateTotalProfit(int attendee){
		int ticketProfit = 5*attendee;
		double costPerPerform = 20.0;
		double costPerDay = costPerPerform + (attendee*0.5);
		double income = ticketProfit - costPerDay;
		System.out.println("Total Profit of the theater per show (in $) is : "+income);
		
	}
}