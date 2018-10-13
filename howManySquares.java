package whatever;

import java.util.Scanner;

public class howManySquares {
	public static void main (String [] args) {
		

		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter Rows ");
		int n = in.nextInt();

		
		System.out.println("Enter Columns ");
		int m = in.nextInt();
		
		
		System.out.print(howManySquares1(n,m));
		
	}
	
	public static int howManySquares1(int n, int m) {
		int bigger =n;
		int smaller =m;
		int count = smaller-1;
		
		int totalSquares =0;

		if (n <= m) {
			bigger = m;
			smaller = n;
			count = smaller-1;
		}
		if(smaller == 1) {
			return bigger;
		}

		while(count > -1) {
			totalSquares += ((bigger-count) * (smaller-count));
			count--;
		}
		
		if(smaller <=0 || bigger <=0) {
			System.out.println("can not calculate of size 0");
			return -1; 
		}
		System.out.print("The total amount of squares is: ");
		return totalSquares;
	}
}
