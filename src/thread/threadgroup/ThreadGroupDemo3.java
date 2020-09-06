package thread.threadgroup;

public class ThreadGroupDemo3 {

	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg, "Child group");
		
		MyThread t1= new MyThread(pg,"thread1");
		MyThread t2= new MyThread(pg,"thread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeGroupCount());//number of active sub groups
		System.out.println(pg.activeCount());//number of running threads in that group
		pg.list();
		Thread.sleep(10000);
		
		System.out.println(pg.activeGroupCount());
		System.out.println(pg.activeCount());//after main thread slept fro 10 seconds. Within that 10 seconds all the child threads will be terminated.
		//so now active thread count is zero.
		pg.list();

	}

}

class MyThread extends Thread{
	
	public MyThread(ThreadGroup pg, String string) {
		super(pg,string);
	}

	public void run(){
		System.out.println("child thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
