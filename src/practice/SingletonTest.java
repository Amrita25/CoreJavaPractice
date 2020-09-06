package practice;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
	
	

	private static void tryWithSerializedSingleton(){
		
		//SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        //ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        //out.writeObject(instanceOne);
        //out.close();
        
        //deserailize from file to object
        //ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        //SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        //in.close();
	}
	
	public static void main(String[] args) {

		BillPughSingleton instance1 = BillPughSingleton.getInstance(); 
		BillPughSingleton instance2 = BillPughSingleton.getInstance(); 

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

		BillPughSingleton instance3=null;

		//Constructor[] constructors = BillPughSingleton.class.getConstructors();
		
		Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
		System.out.println(constructors.length);
		if(constructors.length>0){
			for(Constructor cons : constructors){
				try {
					cons.setAccessible(true);
					instance3=(BillPughSingleton) cons.newInstance();
					break;
				} catch (InstantiationException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println(instance3.hashCode());
		}

	}

}
