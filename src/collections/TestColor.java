package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestColor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ColorPoint p1 = new ColorPoint(1, 2, 2.3f, 3.4, Color.RED);
		Point p2= new Point(1, 2, 2.3f, 3.4);
		ColorPoint p3 = new ColorPoint(1, 2, 2.3f, 3.4, Color.BLUE);
		
		p1.setShape(new Rectancle(3,4));
		p2.setShape(new Rectancle(3, 4));
		p3.setShape(new Rectancle(3, 4));
		//breaks symmetry contract(if p1 is equal to p2 then p2 should also be equal to p1)
		/*boolean result1= p1.equals(p2);
		boolean result2= p2.equals(p1);
		System.out.println("p1.equals(p2) "+result1);
		System.out.println("p2.equals(p1) "+result2);*/

//*******************************************************************************************************

		//breaks transitivity contract( if p1 and p2 equal , p2 andf p3 equal, then p1 should be equals to p3)
		boolean result11= p1.equals(p2);
		boolean result21= p2.equals(p3);
		boolean result31= p1.equals(p3);
		
		System.out.println("p1.equals(p2) "+result11);
		System.out.println("p2.equals(p3) "+result21);
		System.out.println("breaks transitivity => p1.equals(p3) "+result31);
		Point pt = new Point();
		pt.print();
		
	}

}
