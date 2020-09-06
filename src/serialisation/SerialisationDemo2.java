package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Animal implements Serializable{
	
	Cat c = new Cat();
}

class Cat implements Serializable{
	Rat r = new Rat();
}

class Rat implements Serializable{
	int j=10;
}

public class SerialisationDemo2 {	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Animal a= new Animal();
		FileOutputStream fos;
		fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis;
		fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Animal a2= (Animal) ois.readObject();
		
		System.out.println(a2.c.r.j);

	}

}
