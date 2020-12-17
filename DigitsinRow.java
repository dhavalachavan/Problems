package problems;

import java.util.Scanner;

public class DigitsinRow {

	public static void main (String arg[]) {
		
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	scan.close();
	
	for(int i = 1 ;i <=n; i ++) {
		
		System.out.print(i + "\t");
	}
}
}
