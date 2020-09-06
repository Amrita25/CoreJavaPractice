package thread.threadlocal;

public class ThreadLocalDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ParentThread pt = new ParentThread();
		
		pt.start();
		
	}

}
