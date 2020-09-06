package thread.threadgroup;

public class ThreadGroupDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ThreadGroup tg = new ThreadGroup("tg");
		Thread t1 = new Thread(tg, "first thread");//priority 5
		Thread t2 = new Thread(tg, "second thread");//priority 5
		Thread t3 = new Thread(tg, "third thread");//priority 5
		tg.setMaxPriority(3);// max priority of thread group is 3
		
		//Threads in the thread group that have already higher priority wont be affected.
		//But for newly added thread this max priority will be applicable
		Thread t4 = new Thread(tg, "fourth thread");// priority of t4 becomes 3
		
		System.out.println(t1.getPriority());
		System.out.println(t4.getPriority());
	}

}
