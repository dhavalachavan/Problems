package problems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;





public class Babynames {
	
	
	public static void main (String arg[]) {
		
		try {
		  
		
    	FileReader file = new FileReader("C:\\Users\\S0307106\\Desktop\\yob2012short.csv");
    	CSVReader csvreader = new CSVReader(file);
   
    	String[]  test ;
    	int totalgirls = 0;
    	int totalboys = 0;
    	int counter = 0;
    
    	while((test = csvreader.readNext())!= null) {
    		 
    			
    			String cell = 	test[1];
    			
    			if(cell.equalsIgnoreCase("F")){
    			
    			// System.out.print(cell + "\t"); 
    			 totalgirls ++;
    			 
    			}
    			else {
    				totalboys ++;
    			}
    			
    	    	counter++;
    		}
    		
    	System.out.println("Total count"+counter + "Total Girls"+ totalgirls + "Total Boys"+ totalboys);	
    	
    	
		}
    	
    	catch (Exception e) {
    		e.printStackTrace();
    	}
		
		
    
		}
}
