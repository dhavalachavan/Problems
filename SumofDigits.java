package problems;

import java.util.Scanner;

public class SumofDigits {
	
	
		
		public static void main (String args []) {
			
			System.out.println("Enter a number");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			scan.close();
			System.out.println(adddigits(num));
			

}
		
		static int adddigits(int num) {
			int sum = 0 ;
			while(num != 0) {
				sum = sum + num % 10 ;
				num = num / 10;
				
			}
			
			
			return sum ;
		}
		
		
}
