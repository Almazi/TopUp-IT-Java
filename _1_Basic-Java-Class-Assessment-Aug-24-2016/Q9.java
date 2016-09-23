import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width of the river (in meters): ");
		double width = scan.nextInt();
		System.out.println("Enter the river's speed (in meter/sec) : ");
		double riverSpeed = scan.nextInt();
		System.out.println("Enter the boat's speed (in meter/sec) : ");
		double boatSpeed = scan.nextInt();
		Main m = new Main();
		m.distance(width,riverSpeed,boatSpeed);
	}
	
	public void distance(double width, double riverSpeed, double boatSpeed){
		double time = width/boatSpeed;
		double speed = Math.sqrt(Math.pow(boatSpeed,2)+Math.pow(riverSpeed,2));
		double distance = time*speed;
		System.out.println("The distance travelled by boat (in meters) is : "+ distance);
	}
}
