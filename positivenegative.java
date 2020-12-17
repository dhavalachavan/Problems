package problems;

import java.util.Scanner;

public class positivenegative {
	
	public static void main (String args []) {
		int num;
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		
		if(num == 0) System.out.println("The given number is zero");
		else if(num > 0 )System.out.println("The given number is Positive");
		else if(num < 0 )System.out.println("The given number is negative");
		
		
	}

}
