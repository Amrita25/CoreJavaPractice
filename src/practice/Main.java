package practice;

public class Main {
	//private String str="abc";
	
	public static void main(String [] args){
		
		
		
		/*MyClass myclass1=new MyClass();
		//MyClass myclass2=MyClass.myclass;
		//System.out.println(myclass1.equals(myclass2));
		
		//Object myclass3=MyClass.myclass;
		//System.out.println(myclass3.equals(myclass2));
		
		//myclass.print(1, 2);//ambiguous
		Object obj=1;
		Long l= (long) 1;
		
		Object[] objarr = new MyClass[5];  
		objarr[1]=1;
		objarr[2]=2;
		objarr[3]=new MyClass();
		
		
		Node<String> node = new Node<>();
		node.setData("abc");
		
		Node<Integer> node1 = new Node<>();
		node1.setData(2);
		
		
		System.out.println(node.getData());
		System.out.println(node1.getData());
		
		////////////////////////////////////////////////////////
		IMonolink<String> imp=new LymphNode();
		imp.setData("abd");
		imp.setNext(null);
		
		LymphNode<String> imp1=new LymphNode();
		imp=imp1;//super class and subclass parameterized with same type parameter.
		
		LymphNode<Integer> imp2=new LymphNode();
		//imp=imp2;//other wise super class and subclass relationship does not hold
		
		LymphNode<LymphNode<String>> imp3= new LymphNode();//nested parameterisaion
		imp3.setData(imp1);
		imp3.setNext(null);
		
		LymphNode<LymphNode<String>> imp4= new LymphNode();//nested parameterisaion
		imp4.setData(imp1);
		imp4.setNext(imp3);
		
		//raw type
		Node<Integer> node2 = new Node<>();
		node2.setData(1);
		
		Node node3=node2;//we can assign refrence value of parameterised type to refernce of raw type
		node3.setData("ABC");
		
		node2=node3; // unckecked conversion warning;
		
		int i=node2.getData();//class cast exception
		
		//wild cards
		 Node<Object> objnode = null;
		 Node<Number> numnode = null;
		 Node<Integer> intnode = null;
		 Node<? extends Number> extnumnode=null;
		 Node<? extends Integer> extintnode=null;
		 Node<? super Number> supernumnode=null;
		 Node<? super Integer> superintnode;
		 
		 extnumnode=numnode;
		 superintnode=objnode;
		 //objnode=numnode;//unrelated
		 
		 //extnumnode=supernumnode;//unrelated
		 
		 Node<? extends Object> extobj=null;
		 Node<? super Object> superobj=null;// equivalent to Node<Object>
		 
		 extobj=superobj;//allowed
		 
		 superintnode=supernumnode;
		 
		 
		 
		 extobj=superintnode;//Node<? extends Object> <= Node<? super Integer>
		 
		 extobj=extintnode;//Node<? extends Object> <= Node<? extends Integer>
		 
		 superintnode=superobj;
		 
		 
		 extnumnode=extintnode;
		 
		 
		 
		Node raw=new Node();
		
		Node<?> anynd = raw;
		raw=anynd;*/
		
		
		 
		
		 
		CompNode<Boolean> c1= new CompNode<>();
		CompNode<Boolean> c2= new CompNode<>();
		c1.setData(Boolean.TRUE);
		c2.setData(Boolean.TRUE);
		System.out.println(c1.compareTo(c2)); 
		 
		 
		 
		
	}

}
