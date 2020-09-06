package innerclass;

public class Parent {
	
	void print(){
		System.out.println("inside parent");
	}
	
	
	class Child extends Parent{
		void print(){
			System.out.println("inside child");
		}
	}

}
