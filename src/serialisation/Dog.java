package serialisation;
import java.io.*;

public class Dog implements Serializable{
	
	int i=10;
	int j=20;
	
	public String toString(){
		return "i : "+i+" j : "+j;
	}

}
