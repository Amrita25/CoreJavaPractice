package collections.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class SortFruitObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[5];

		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
		Fruit apple = new Fruit("Apple", "Apple description",100); 
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		Fruit banana = new Fruit("Banana", "Banana description",1190); 
		Fruit pineappale2 = new Fruit("Pineapple", "Pineapple description",60);

		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		fruits[4]=pineappale2;

		Arrays.sort(fruits);
		

		int i=0;
		for(Fruit temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
					", Quantity : " + temp.getQuantity());
		}
		
		TreeMap<Fruit,Integer> sortedmap = new TreeMap(new Comparator<Fruit>(){

			@Override
			public int compare(Fruit f1, Fruit f2) {
				int result = (f1.getQuantity()>f2.getQuantity()) ? -1 : ((f1.getQuantity()<f2.getQuantity())?1:0);
				return result;
				
			}
			
			
		});
		sortedmap.put(pineappale, 1);
		sortedmap.put(apple, 1);
		sortedmap.put(orange, 1);
		sortedmap.put(banana, 1);
		sortedmap.put(pineappale2, 1);
		
		
		
		System.out.println(sortedmap);
		

	}	

}


