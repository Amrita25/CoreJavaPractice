package serialisation;

import java.io.*;

public class SerialisationDemo1 {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Dog d1= new Dog();
		FileOutputStream fos;
		fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis;
		fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2= (Dog) ois.readObject();
		
		System.out.println(d2);
	}

}
