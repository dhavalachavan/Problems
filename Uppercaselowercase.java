package problems;

import java.util.Scanner;

public class Uppercaselowercase {

	
	public static void main (String arg[]) {
		
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		
		System.out.println("The enterned character is "+ c+ " The new character is "+ convert(c));
}
	
	static char convert(char c) {
	  
		if(Character.isLowerCase(c)) {
		c =	Character.toUpperCase(c);
		}
		else {
			c = Character.toLowerCase(c);
		}
		return c;
	}
}
