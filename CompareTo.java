package problems;

import java.util.Scanner;

public class CompareTo {
	public static void main (String arg[]) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first Character");
	String n = scan.next();
	
	System.out.println("Enter the Second Character");
	String m = scan.next();
	
	scan.close();
	

	if( n.compareToIgnoreCase(m)>1) {
		System.out.println("Output sequence is "+ m + " "+n);		
		
	}
	else {
		System.out.println("Output sequence is "+ n +" "+m);	
	}
		
	}
}

