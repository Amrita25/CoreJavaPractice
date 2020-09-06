package innerclass;

import java.io.FileNotFoundException;
import java.io.IOException;

import innerclass.Parent.Child;

public class ParentTest implements Type3{


	public static void main(String[] args){

		
			Parent p = new Parent();
			Child c = p.new Child();
			c.print();
			p.print();
			System.out.println("");
			
			Type3 t3 = new ParentTest();
			t3.f();
		

	}

	

}

interface Type1 {
	void f() throws CloneNotSupportedException;
}
interface Type2 {
	void f() throws InterruptedException;
}
interface Type3 extends Type1, Type2 {
}
