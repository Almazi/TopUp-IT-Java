import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the time (in seconds) :");
		int time = scan.nextInt();
		Main m = new Main();
		m.calculateHeight(time);
	}
	
	public void calculateHeight(int time){
		double speed = 9.8 * time;
		double height = 0.5*speed*time;
		System.out.println("Height reached (in meters) is : "+ height);
	}
}