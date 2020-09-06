package thread;

public class ThreadA {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		
		//Thread.sleep(10000);//Main thread will keep waitiung for ever as it slept while child thread executed
		synchronized (b) {
			
		try {
			System.out.println("main thread calling wait method");
			b.wait();
			System.out.println("main thread got notification");
			System.out.println("total is : "+b.total);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}

	}

}
