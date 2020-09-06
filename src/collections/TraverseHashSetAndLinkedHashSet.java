package collections;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;


public class TraverseHashSetAndLinkedHashSet {
	
	public static void javaTreeMapNavigationExamples (){
		
		
		TreeMap<Integer,String> map = new TreeMap<>();
		for(int i=0;i<10;i++) {
			map.put(i, i+"");
		}
		
		System.out.println(map);
		
		Entry<Integer,String> entry = map.lowerEntry(5);
		System.out.println("Closest Lower key than 5 is "+entry);
		entry = map.higherEntry(5);
		System.out.println("Closest Higher key than 5 is "+entry);
		
		entry = map.firstEntry();
		System.out.println("First Entry is "+entry);

		entry = map.lastEntry();
		System.out.println("Last Entry is "+entry);
		
		Map<Integer, String> reversedMap = map.descendingMap();
		System.out.println("Reversed Map: "+reversedMap);
	}


	public static void treeMapReverseExample(){

		Map<Integer,String> map = new TreeMap<>();

		map.put(10, "10");
		map.put(1, "1");
		map.put(5, "5");
		
		map= new TreeMap(new Comparator<Integer>(){

			@Override
			public int compare(Integer x, Integer y) {
				int i = x > y ? -1 : ((x == y) ? 0 : 1);
				return i;
			}
			
		});
		
		map.put(10, "10");
		map.put(1, "1");
		map.put(5, "5");
		
		System.out.println(map);

	}

	public static void mymethod(){

		Map<Integer,String> map1 = new TreeMap<>();
		map1.put(4, "abc");
		map1.put(1, "abc");
		map1.put(7, "abc");
		map1.put(3, "abc");


		Map<Integer,String> table = new Hashtable<>();

		for(Entry<Integer,String> en : map1.entrySet()){

			System.out.println(en.getValue());
			System.out.println(en.getKey());
		}

		Set<String> set1=new HashSet<>();

		List<String> arraylist = new ArrayList();
		arraylist.add("abc");
		arraylist.add("xyz");
		arraylist.add("pqr");
		arraylist.add("ttt");



		List<String> arraylist2 = new ArrayList();
		arraylist2.add("rrr");
		arraylist2.add("xyz");
		arraylist2.add("ttt");

		arraylist.retainAll(arraylist2);

		System.out.println("retain "+arraylist);

		List<String> linkedlist = new LinkedList<>();
		linkedlist.add("ab");

		/*String[] arr = new String[arraylist.size()];
		arr=arraylist.toArray(arr);
		System.out.println(arr);*/


		/*List<String> copyonlist = new CopyOnWriteArrayList<>();

		copyonlist.add("a");
		copyonlist.add("b");
		copyonlist.add("c");
		copyonlist.add("d");

		ListIterator<String> it =arraylist.listIterator();
		while(it.hasNext()){
			it.next();
			//arraylist.add("ab");
			arraylist.set(0, "amr");

		}
		ListIterator<String> i2 =arraylist.listIterator(2);

		while(i2.hasPrevious()){
			System.out.println(i2.previous());
		}

		ListIterator<String> i3 =copyonlist.listIterator();
		while(i3.hasNext()){
			//i3.next();
			System.out.println(i3.next());
			copyonlist.add("e");
		}

		 */


	}
	public static void main(String[] args) {
		javaTreeMapNavigationExamples();

		/*Set<String> set1=new HashSet<>();		
		set1.add("breakfast");
		set1.add("lunch");
		set1.add("dinner");

		for(String str : set1){
			System.out.println("From HashSet "+str);
		}

		Set<String> set2=new LinkedHashSet<>();
		set2.add("breakfast");
		set2.add("lunch");
		set2.add("dinner");

		for(String str : set2){
			System.out.println("From LinkedHashSet "+str);
		}

		List <String> strlist=Arrays.asList("breakfast","snacks","breakfast","lunch","lunch","dinner");
		for(String str : strlist){
			System.out.println("values from "+str);
		}
		//converting a list to a set
		Set<String> setfromlist = new HashSet(strlist);

		for(String str : setfromlist){
			System.out.println("after converting a list to a set "+str);
		}*/

	}

}
