package thread.threadlocal;

public class ThreadLocalDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		CustomerThread c1 = new CustomerThread("customer 1");
		CustomerThread c2 = new CustomerThread("customer 2");
		CustomerThread c3 = new CustomerThread("customer 3");
		
		c1.start();
		c2.start();
		c3.start();
	}

}
