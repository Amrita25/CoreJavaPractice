package practice;

public class Node<E> {
	
//***** private static E data; // formal parameter E is non static type. So it cannot be used in static context
//*****	E e = new E() ; // no allowed because it is not known which concrete type it represents
	
	private  E data;

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
	public <E> void myinstancegenericmethod(E key,E[] arr){
		arr[0]=key;
	}
	
	public static <E> void mystaticgenericmethod(E key,E[] arr){
		Node<? extends E> node=null;
		Node<?> anynode=null;
		
		node=anynode;
	}
	
	

}
