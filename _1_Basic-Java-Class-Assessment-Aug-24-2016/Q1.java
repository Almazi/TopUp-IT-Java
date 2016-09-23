import java.util.*;

class Main{
	public static void main(String[] args){
		System.out.println("Enter the value of n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int number[] = new int[n];
		int squaresSum = 0;
		int sumsSquare = 0;
		System.out.println("The " + n + " number are: ");
		for(int i = 0; i < n; i++){
			number[i] = scan.nextInt();
			squaresSum = squaresSum + number[i]*number[i];
			sumsSquare = sumsSquare+number[i];
		}
		sumsSquare = sumsSquare*sumsSquare;
		
		System.out.println("Sum of squares of the given " + n + " numbers are: "+squaresSum);
		System.out.println("Square of the sum of the given " + n + " numbers are: "+sumsSquare);
		
	}
	
}