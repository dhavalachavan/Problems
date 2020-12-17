package problems;

import java.util.Scanner;

public class Primenumber {

	public static void main (String arg[]) {
	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(isPrime(num)) System.out.println("The given number is Prime");
		else System.out.println("The given number is not Prime");	
		
	}
	
	static boolean isPrime(int n ) {
		
		if(n <= 1)return false;
		
		else if (n == 2) return true;
		
		else if (n % 2 == 0) return false;
		
		// Check if odd

		for(int i = 3 ; i <= Math.sqrt(n) ; i += 2) {
			
			if(n % i == 0) return false;
		}
		
		return true;
	}
}
