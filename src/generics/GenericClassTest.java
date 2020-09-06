package generics;

import java.util.*;



public class GenericClassTest {
	
	
	private static void gnerictest(){
		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");
		boolean same = GenericClass.<Integer, String>compare(p1, p2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		gnerictest();
		
		GenericClass<String> gen1 = new GenericClass("abc");
		gen1.show();
		
		GenericClass<Integer> gen2 = new GenericClass(1);
		gen2.show();
		
		ArrayList<String> list1 = new ArrayList();
		ArrayList<Integer> list2 = new ArrayList();
		
		gen2.mymethod3(list1);
		//gen2.mymethod3(list2);
		
		gen2.mymethod(list1);
		gen2.mymethod(list2);
		
		gen2.mymethod1(list2);//mymethod2


	}

}
