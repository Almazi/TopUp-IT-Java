import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base radius : ");
		int radius = scan.nextInt();
		System.out.println("Enter the height  : ");
		int height = scan.nextInt();
		Main m = new Main();
		m.calculateCylinderArea(radius,height);
	}
	
	public void calculateCylinderArea(int radius, int height){
		double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
		System.out.println("Surface Area of the cylinder is : "+surfaceArea);
		
	}
}