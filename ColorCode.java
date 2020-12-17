package problems;

import java.util.HashMap;
import java.util.Scanner;

public class ColorCode {
	
public static void main (String arg[]) {
		
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		scan.close();
		
		System.out.println(n);
		
		HashMap<String, String> hash1 = new HashMap<String, String>();
		
		hash1.put("R", "Red");
		hash1.put("B", "Blue");
		hash1.put("G", "Green");
		hash1.put("O", "orange");
		
		if(hash1.containsKey(n)){
			System.out.println("The corresponding color value for "+ n +" is "+ hash1.get(n));
			
		}
		else {
			System.out.println("The given character is invalid");
		}
	}

}
