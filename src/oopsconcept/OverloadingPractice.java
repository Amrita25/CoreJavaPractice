package oopsconcept;

public class OverloadingPractice {

	public void method1(int i,Integer j){
		System.out.println("inside int method  "+i);
	}
	
	public void method1(Integer i){
		System.out.println("inside Integer Wrapper method  "+i);
	}

	public void method1(float f){

		System.out.println("inside float method  "+f);
	}
	
	
	public void method1(String str){
		System.out.println("inside String method  "+str);
	}
	
	public void method1(StringBuffer str){
		System.out.println("inside StringBuffer method  "+str);
	}
	
	public void method1(Object obj){
		System.out.println("inside Object method  "+obj);
	}


	public static void main(String[] args) {
		
		OverloadingPractice obj = new OverloadingPractice();
		obj.method1(10); //int method 
		obj.method1(Integer.valueOf(10));
		obj.method1(3.5f); // float method
		obj.method1('a'); //int method 
		obj.method1(9l);
		
		obj.method1(new Object());
		obj.method1("abc");
		//obj.method1(null);//ambiguous bw String and StringBuffer

	}

}
