package fundamentalclasses;


//immutable class
public class Complex {
	
	private int number;
	
	public static final Complex ZERO= valueOf(0);
	public static final Complex ONE= valueOf(1);
	
	private Complex(int number){
		this.number=number;
	}
	
	public static Complex valueOf(int num){
		return new Complex(num);
	}
	
	public Complex add(Complex obj){
		return new Complex(number + obj.number);
	}
	public Complex subtract(Complex obj){
		return new Complex(number - obj.number);
	}
	
	public Complex multiply(Complex obj){
		return new Complex(number * obj.number);
	}

}
