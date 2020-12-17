package problems;

import java.util.Scanner;

public class Menu {
	
	public static void main(String args[]) {
		
		
		
		String function = enteroption();
		

		System.out.println("User please enter 2 numbers:");
		Scanner q = new Scanner(System.in);
				int a = q.nextInt();
		//Scanner  = new Scanner(System.in);
	//	int b = q.nextInt();
		
		switch(function.toLowerCase())
		{
		case "add":
			System.out.println(a + a);
			break;
			
		case "sub":
			System.out.println(a - a);
			break;	
			
		default :
			System.out.println("Unrecognized Selection");
			break;	
			
		}
		
		
	}
	
	
	static String enteroption() {
		
		
		System.out.println("User Please Enter from the options A)ADD B)SUB");
		System.out.print("Selection:");
		Scanner scan = new Scanner(System.in);
		String function = scan.next();
		scan.close();
		return function ;
	}

}
