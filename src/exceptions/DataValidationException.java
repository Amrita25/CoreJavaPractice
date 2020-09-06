package exceptions;

public class DataValidationException extends Exception {
	
	private int sum;
	private int number;
	
	public DataValidationException(String msg,Throwable cause,int sum,int num){
		super(msg,cause);
		System.out.println("data validation exception");
		this.sum=sum;
		number=num;
	}
	@Override
	public String getMessage(){
		System.out.println("get msg");
		return "exception occurred for the sum "+sum+" and total number "+number;
		
	}
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
