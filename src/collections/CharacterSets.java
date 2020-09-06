package collections;
  import java.util.*;

import javax.print.attribute.HashAttributeSet;

public class CharacterSets {

	//to find the super set and subsets of characters  
	public static void main(String[] args) {
			
			String[] strarr= {"i","said","i","am","maids"};
			Set<Character> encountered=new HashSet();
			
			for(String str : strarr){
				Set<Character> characters=new HashSet();
				int length=str.length();
				for(int j=0;j<length;j++){
					characters.add(str.charAt(j));
				}
				Set<Character> commonset=new HashSet(encountered); 
				commonset.retainAll(characters);
				boolean aredisjoint=commonset.size()==0; 
				
				if(aredisjoint){
					System.out.println(characters + " and "+encountered+" are disjoint ");
				}else{
					boolean isSubset=encountered.containsAll(characters);
					boolean isSuperset=characters.containsAll(encountered);
					if(isSubset && isSuperset){
						System.out.println(characters + " and "+encountered+" are equivalent ");
					}else if(isSubset){
						System.out.println(characters + " is a subset of "+encountered);
					}else if(isSuperset){
						System.out.println(characters + " is a superset of "+encountered);
					}
					else{
						System.out.println(characters + " and "+encountered);
					}
					
					
				}
				encountered.addAll(characters);
				
			}
			
	}

}
