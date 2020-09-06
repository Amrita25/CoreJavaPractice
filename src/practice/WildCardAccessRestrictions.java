package practice;

public class WildCardAccessRestrictions {

	
	
	public static void checkit(Node node){
		Object obj=new Object();
		Number num=1.5;
		Integer intnum=10;
		
		node.setData(obj);//unchecked call warning. we dont know the datatype of the element
		node.setData(num);//unchecked call warning. we dont know the datatype of the element
		node.setData(intnum);//unchecked call warning. we dont know the datatype of the element 
		
		obj=node.getData();
		num=node.getData();//error !raw type. we dont know the datatype of the element
		intnum=node.getData();//error ! raw type. we dont know the datatype of the element
		node.setData(node.getData());
		
	}
	public static void checkit1(Node<?> node){
		Object obj=new Object();
		Number num=1.5;
		Integer intnum=10;
		
		node.setData(obj);//because the data type is not known we can not set any data .it might not be type safe
		node.setData(num);//because the data type is not known we can not set any data .it might not be type safe
		node.setData(intnum);//because the data type is not known we can not set any data .it might not be type safe
		
		obj=node.getData();//because the data type is not known we can safely read it as an object
		num=node.getData();//because the data type is not known we can safely read it as an object
		intnum=node.getData();//because the data type is not known we can safely read it as an object
		node.setData(node.getData());//because the data type is not known we can not set any data .it might not be type safe
		
	}
	public static void checkit2(Node<? extends Number> node){
		Object obj=new Object();
		Number num=1.5;
		Integer intnum=10;
		
		node.setData(obj);
		node.setData(num);
		node.setData(intnum);
		
		obj=node.getData();
		num=node.getData();//number or super type of number
		intnum=node.getData();////because the data type is not known we can safely read it
		node.setData(node.getData());
		
	}
	
	public static void checkit3(Node<? super Number> node){
		Object obj=new Object();
		Number num=1.5;
		Integer intnum=10;
		
		node.setData(obj);
		node.setData(num);
		node.setData(intnum);//we can set number or subtype of number safely
		
		obj=node.getData();//because the data type is not known we can safely read it as an object
		num=node.getData();
		intnum=node.getData();
		node.setData(node.getData());
		
	}
	
	public static void main(String[] args) {
		Number num=10;
		Object obj=10.5;
		Integer i=4;
		
		Node<? extends Number> wildnum= new Node<Number>();
		wildnum.setData(num);//compiler does not know that wilnum refres to a Number node at runtime
		wildnum.setData(obj);
		wildnum.setData(i);
		
		Object ob=wildnum.getData();
		Number n=wildnum.getData();

	}

}
