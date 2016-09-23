import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base radius : ");
		int radius = scan.nextInt();
		System.out.println("Enter the length  : ");
		int length = scan.nextInt();
		System.out.println("Enter the thickness : ");
		int thickness = scan.nextInt();
		Main m = new Main();
		m.calculatePipeArea(radius,length,thickness);
	}
	
	public void calculatePipeArea(int radius, int length, int thickness){
		double surfaceArea = 2 * Math.PI * Math.pow(radius,2) * length;
		System.out.println("Surface Area of the cylinder is : "+surfaceArea);
		
	}
}

