import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = scan.nextDouble();
		System.out.println("Enter the height: ");
		double height = scan.nextDouble();

		System.out.println("Volume of the cylinder is : " + (Math.PI * Math.pow(radius, 2) * height));
	}
}