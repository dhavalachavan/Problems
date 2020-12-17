package problems;

import java.util.Scanner;

public class DisplayMonth {

	
	public static void main (String arg[]) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String [] months = {"January", "February","March","April","May","June" , "July" , "August" ,"September" , "October","November","December"};
		
		if(n >= 1 && n<=12) {
			System.out.println("The month corresponding to the input "+ n +" is "+months[n-1]);
			
		}
		else {
			System.out.println("The given number is invalid");
		}
	}
}
