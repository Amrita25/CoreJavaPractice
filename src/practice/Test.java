package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Exc0 extends Exception{
	
}
class Exc1 extends Exc0{
	
}
public class Test{

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hh = new HashMap<>();
		
		
		/*hh.put(2, 100);
		hh.put(3, 150);
		hh.put(4, 70);
		hh.put(5, 50);*/
        //hh.replace(2, hh.get(2), 4);
        //System.out.println(hh);
       // System.out.println(Collections.max(hh.values()));
		int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 }; 
	    int n = arr.length; 
	    
	    boolean visited[] = new boolean[n]; 
	      
	    Arrays.fill(visited, false); 
	  
	    // Traverse through array elements and 
	    // count frequencies 
	    for (int i = 0; i < n; i++) { 
	  
	        // Skip this element if already processed 
	        if (visited[i] == true) 
	            continue; 
	  
	        // Count frequency 
	        int count = 1; 
	        for (int j = i + 1; j < n; j++) { 
	            if (arr[i] == arr[j]) { 
	                visited[j] = true; 
	                count++; 
	            } 
	        } 
	        System.out.println(arr[i] + " " + count); 
	    } 
	


	}
	public static void countFreq(int arr[], int n) 
	{} 

}
