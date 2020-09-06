package thread.threadgroup;

public class ThreadGroupDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadGroup parent = new ThreadGroup("parent group");
		ThreadGroup g1 = new ThreadGroup(parent, "second group");
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println(parent.getParent().getName());
		System.out.println(g1.getParent().getName());

	}

}
