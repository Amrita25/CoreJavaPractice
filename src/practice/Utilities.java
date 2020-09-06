package practice;

import java.security.KeyStore.Entry;
import java.util.*;

public class Utilities {

	
	public static <E> Boolean containsV2(E key, E[] arr){
		for(E element : arr){
			if(key.equals(element)){
				return true;
			}
		}
		return false;
	}
	
	//Key is bound to be the subtype of Element type
		public static <E, K extends E> Boolean containsV3(K key, E[] arr){
			for(E element : arr){
				if(key.equals(element)){
					return true;
				}
			}
			return false;
		}
	
	public static <E> E[]  formarray(E key,E[] arr){
		arr[0]=key;
		return arr;
	}
	
	public static <E, K extends E> E[]  formarray2(K key,E[] arr){
		arr[0]=key;
		return arr;
	}
	
	public static<K,V> Map<V,List<K>> toMultiMap(Map<K,V> origmap){
		Map<V,List<K>> finalmap= new HashMap();
		List<K> list = new ArrayList<>();
		for(Map.Entry<K, V> entry : origmap.entrySet()){
			list.add(entry.getKey());
		}
		for(Map.Entry<K, V> entry : origmap.entrySet()){
			finalmap.put(entry.getValue(), list);
		}
		return finalmap;
	}
	
	public static void fillWithFirstV1(List<?> list){
		
	}
	
	public static <T> void move( Node<? extends T> node1,Node<? extends T> node2){
		System.out.println("inside method");
	}

}
