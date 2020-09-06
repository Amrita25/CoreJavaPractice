package staticinitializerspractice;

public class NonStaticInitializers {
	
	int length=10;
	//double area=length*width;//declaration before reading rule is violated
	double area=length*this.width;//it will read the default value 0 
	int width=12;
	
	void printarea(){
		System.out.println("area is : "+area);
		
	}
	
	public static void main(String [] args){
		NonStaticInitializers obj = new NonStaticInitializers();
		obj.printarea();
	}

}
