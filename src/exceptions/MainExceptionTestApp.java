package exceptions;

public class MainExceptionTestApp {
	
	public static void main(String [] args){
		
		AverageCalculation avg= new AverageCalculation();
		try {
			avg.printAvg(25, 0);
		} catch (DataValidationException e) {
			e.printStackTrace();
			System.out.println("exception handled");
		}
	
		
	}

}
