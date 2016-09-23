import java.util.*;

class Main{
	public static void main(String[] args){
		System.out.println("Enter the area: ");
		Scanner scan = new Scanner(System.in);
		double area = scan.nextDouble();
		double sqRouteOfArea = Math.sqrt(area);
		System.out.println("Perimeter of the square is:  "+sqRouteOfArea*4);
	
	}
}