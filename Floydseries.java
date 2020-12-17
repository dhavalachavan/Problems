package problems;

import java.util.Scanner;

public class Floydseries {
	
public static void main (String arg[]) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Limit Number:");
		int first = scan.nextInt();
		scan.close();
		int number = 1;
		
		for(int i = 1 ; i <= first ; i ++) {
			
			for(int j = 1 ; j <= i; j ++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
		
	}

}
