package thread.threadlocal;

public class ThreadLocalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadLocal tl = new ThreadLocal(){
			
			@Override
			public Object initialValue(){
				return "amrita";
			}
		};
		
		System.out.println(tl.get());
		tl.set("abc");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
		

	}

}
