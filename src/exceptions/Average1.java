package exceptions;

import java.io.FileNotFoundException;

public class Average1 {
	
	public static void printAverage(int totalsum,int totalnum){
		try{
		int avg=computeAverage(totalsum,totalnum);
		}
		catch(IllegalArgumentException ex){
			System.out.println("exception handled in printAverage method");		
			
			
		}
		
		System.out.println("exit printAverage");
	}
	
	public static int computeAverage(int totalsum,int totalnum) {
		System.out.println("computing average"); 
		return totalsum/totalnum;
	}
	
	public static void main(String [] args){
		try{
		printAverage(19,0);
		}		
		catch(ArithmeticException e){
			System.out.println("exception handled in main method");
		}
		System.out.println("exit main");
	}

}
