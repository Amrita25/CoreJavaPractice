package collections;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<String> strset = new HashSet();
		
	
		
		strset.add("abcd");
		strset.add("bcd");
		strset.add("xyz");
		strset.add("mnp");
		
		Object[] objarr = strset.toArray();
		String [] strarr1= new String[0];
		String [] strarr2=strset.toArray(strarr1);
		
		String [] strarr3= new String[5];
		String [] strarr4=strset.toArray(strarr3);
		
		String [] strarr5= new String[4];
		String [] strarr6=strset.toArray(strarr5);
		
		System.out.println("strarr1 == strarr2 "+(strarr1 == strarr2));
		System.out.println("strarr3 == strarr4 "+(strarr3 == strarr4));
		System.out.println("strarr5 == strarr6 "+(strarr5 == strarr6));
		
		
		

	}

}
