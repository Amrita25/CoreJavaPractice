package exceptions;

import java.io.FileNotFoundException;

public class Average2 {
	
	public static int printAverage(int totalsum,int totalnum){
		int avg=0;
		try{
		 avg=computeAverage(totalsum,totalnum);
		 System.out.println("inside try block");
		 return avg;
		}
		catch(ArithmeticException ex){
			//ex.printStackTrace();		
			System.out.println("exception handled in printAverage method");		
			
			
		}
		finally{
			System.out.println("finally done !!");
			//throw new FileNotFoundException();
			return 10;
		}
		
		
		//System.out.println("exit printAverage");
		
	}
	
	public static int computeAverage(int totalsum,int totalnum){
		System.out.println("computing average"); 
		return totalsum/totalnum;
	}
	
	public static void main(String [] args){
		
		int avg=printAverage(20,0);
		System.out.println("avg "+avg);
		
		System.out.println("exit main");
	}

}
