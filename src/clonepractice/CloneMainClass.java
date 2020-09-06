package clonepractice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CloneMainClass {
	
	public static void main(String [] args){
		
		Shape shape1= new Shape("circle", new Date("08/23/2017"));
		//System.out.println("before "+shape1.getDate());
		//this breaks encapsulation.because you can change the state of a mutable object
		Date date = shape1.getDate();
		date.setHours(5);
		Shape shape2=(Shape) shape1.clone();
		System.out.println("date "+date);
		
		System.out.println("after "+shape1.getDate());
		
		
		
	}

}
