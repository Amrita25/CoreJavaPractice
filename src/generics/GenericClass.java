package generics;

import java.util.ArrayList;
import java.util.Map;

public class GenericClass<T> {

	private T obj;

	public GenericClass(T obj){
		this.obj=obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public String show(){
		System.out.println("T type is : "+obj.getClass().getName());

		return obj.getClass().getName();
	}
	//ArrayList<?>  list = read only 
	public void mymethod(ArrayList<?>  list){

		System.out.println("inside ArrayList<?> list : list cannot be modified : read only operations "+list);
		 list.add(null);//valid value for any type
	}

	//readonly
	public void mymethod1(ArrayList<? extends Number> list){

		System.out.println(list.getClass().getTypeParameters().getClass().getName());
		list.add(null);
		//list.add(8);
	}
	
	
	public void mymethod2(ArrayList<? super Integer> list){

		System.out.println(list.getClass().getTypeParameters().getClass());
		list.add(9);
	}
	
	 
	
	public void mymethod3(ArrayList<String> list){
		
		list.add("abc");

		System.out.println("ArrayList<String> list "+list.get(0));
	}
	
	public static <K,V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
		
		 return p1.getKey().equals(p2.getKey()) &&
	               p1.getValue().equals(p2.getValue());
		
	}



}
