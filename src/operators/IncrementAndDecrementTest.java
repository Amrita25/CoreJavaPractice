package operators;

public class IncrementAndDecrementTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x=1111;
		
		System.out.println((++x)-(--x));
		
		double d = 10.5;
		d++;
		System.out.println(d);
		
		char ch='a';
		ch++;
		
		System.out.println(ch);
		
		byte a =10;
		a=(byte) (a+1);
		System.out.println(a);
		
		

	}

}
