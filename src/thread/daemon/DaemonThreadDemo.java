package thread.daemon;

public class DaemonThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		MyThread t = new MyThread();
		System.out.println(t.getThreadGroup().getName());//thread group name
		System.out.println(t.getThreadGroup().getParent().getName());//Main group is the child group of system group
		t.setDaemon(true);
		t.start();
		
		System.out.println("end of main thread");

	}

}
