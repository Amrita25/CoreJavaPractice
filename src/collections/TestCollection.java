package collections;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.*;

public class TestCollection {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		List<String> stringlist = new ArrayList();
		stringlist.add("abc");
		stringlist.add("xyz");
		
		Set<String> hashset= new HashSet();
		
		List<Number> numlist=new ArrayList();
		numlist.add(new Double(2.4));
		numlist.add(new Long(-4l));
		numlist.add(2);
		numlist.add(new Double(5.4));
		
		List<Integer> intlist = new ArrayList();
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		intlist.add(5);
		
		numlist.retainAll(intlist);
		System.out.println("retainAll "+numlist);
		
		numlist.addAll(intlist);//argument collection needs to have elements of type Number of subtype of number
		//numlist.addAll(stringlist);//will not compile
		
		boolean hascontent = numlist.containsAll(stringlist);//argument can be collectoion of any type of elements
		
		//boolean retain2 = numlist.retainAll(stringlist);
		System.out.println("add all "+numlist);
		System.out.println("contains all "+hascontent);
		
		intlist.clear();
		System.out.println(intlist);
		
		
		

	}

}
