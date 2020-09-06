package clonepractice;

import java.util.*;
import java.util.Map.Entry;

public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		String str=null;
		List<String> namelist = new ArrayList<>();
		namelist.add("a");
		namelist.add("a");
		namelist.add("e");
		namelist.add("b");
		namelist.add("c");
		namelist.add("d");
		namelist.add("a");
		namelist.add("e");
		namelist.add("a");
		namelist.add("b");
		namelist.add("e");
		namelist.add("c");
		namelist.add("c");
		namelist.add("a");
		
		Set<Integer> sortedset = new TreeSet<>(Collections.reverseOrder());
		Map<String,Integer> resultmap = new HashMap();
		
		
		
		for(int i=0;i<namelist.size();i++){
			
			count=0;
			str=namelist.get(i);
			
			for(int j=0;j<namelist.size();j++){		
				
				if(str.equals(namelist.get(j))){
					count++;
				}
			}
			sortedset.add(count);
			
			resultmap.put(str, count);
		}
		
		
		List<String> result=new ArrayList<>();
		
		Iterator<Integer> it = sortedset.iterator();
		
		while(it.hasNext()){
			Integer in=it.next();
			for(Map.Entry<String, Integer> entry : resultmap.entrySet()){
				int val =entry.getValue();
				if(in.equals(val)){
					result.add(entry.getKey());
					
				}
			}
			
		}
		
		
		System.out.println(resultmap);
		System.out.println(sortedset);
		System.out.println("result : "+result);

	}

}
