package practice;

import java.util.HashMap;
import java.util.Map;

public class UtilitiesApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer[] intarray={1,2};
		Double d=12.5;
		
		Utilities.containsV2(1, intarray);//E is inferred to be an integer
		Utilities.containsV2(d, intarray);//E is inferred to be a ? extends  number. compiler infers the actual type parameter some subtype of number
		Utilities.containsV2("abc", intarray);//? extends Object //
		//System.out.println(Utilities.formarray("abc", intarray));//it throws array store exception
		
		
		/*Utilities.containsV3(1, intarray);
		Utilities.containsV3(d, intarray);//Key is bound to be a subtype of element type
		Utilities.containsV3("abc", intarray);*/
		
		// compile time error!! as Key is bound to be a subtype of element type
		//Otherwise it would throw array store exception
		//Utilities.formarray2("abc", intarray);
		
		Map<Integer,String> origmap= formMap();
		origmap.put(1, "amrita");
		origmap.put(2, "taira");
		origmap.put(3, "ml");
		
		
		/*Map<? extends Number,Integer> origmap1= formMap();		
		origmap1.put(1, 2);// not allowed for ? extends Number
		origmap1.put(2, 3);
		origmap1.put(3, 4);*/
		
		Map<? super Number,Integer> origmap2= formMap();		
		origmap2.put(1, 2);// allowed for integer
		origmap2.put((Number)2, 3); // allowed for number
		origmap2.put(3, 4);
		
		System.out.println(Utilities.toMultiMap(origmap2));
		
		Node<?> anynode1=new Node<>();
		Utilities.move(anynode1,anynode1);
	}
	
	public static <K,V> Map<K,V> formMap(){
		Map<K,V> formedmap=  new HashMap<>();
		return formedmap;
	}

}
