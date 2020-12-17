package problems;

import java.util.Scanner;

public class TenNintyNine {
	
	public static void main (String arg[]) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Limit Number:");
		int first = scan.nextInt();
		System.out.println("Enter the second Limit Number:");
		int second = scan.nextInt();
		isprime(first,second);
		
	}
		
		static void isprime(int n , int m){
			
			int flag = 0 ;
			int counter = 0;
			
			for(int i = n ; i <=m ; i ++) {
				
				for(int j = 2 ; j< i; j ++) {
					
					if(i % j == 0) {
						flag = 0;
						
						break;
					}
					else {
						flag = 1;
						
					}
				}
				
				if(flag == 1) {
					counter ++;
					System.out.println("The Prime number is :"+ i);
					
				}
			}
			
			
			System.out.println("The total Prime Numbers Between "+ n + " and"+m+" is "+counter);	
			
			
		}
		
		
		
		
	}


