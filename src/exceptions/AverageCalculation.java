package exceptions;

import java.util.Date;

public class AverageCalculation {
	
	public void printAvg(int sum,int number) throws DataValidationException{
		try{
		int avg=computeavg(sum,number);
		//throw new RuntimeException();
		}
		catch(ArithmeticException e){
			System.out.println("exception");
			throw new DataValidationException("Exception occurred while calculating average in the class AverageCalculation",e,sum,number);
			
		}
	}
	
	private int computeavg(int sum,int number){
		System.out.println("computing");
		return sum/number;
	}
	
	

}
