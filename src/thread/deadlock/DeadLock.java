package thread.deadlock;

public class DeadLock extends Thread{
	
	public DeadLock(String name){
		super(name);
	}
	
	public void run(){
		try {
			method1();
			method2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void method1() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"waiting for lock on Integer");
		synchronized (Integer.class) {
			
			System.out.println(Thread.currentThread().getName()+" got lock on Integer");
			System.out.println(Thread.currentThread().getName()+"waiting for lock on String");
			Thread.sleep(1000);
			synchronized (String.class){
				System.out.println(Thread.currentThread().getName()+" got lock on String");
			}
		}
	}
	
	private void method2() throws InterruptedException{
		
		System.out.println(Thread.currentThread().getName()+"waiting for lock on String");
		synchronized (String.class) {
			
			System.out.println(Thread.currentThread().getName()+" got lock on String");
			System.out.println(Thread.currentThread().getName()+"waiting for lock on Integer");
			Thread.sleep(1000);
			synchronized (Integer.class){
				System.out.println(Thread.currentThread().getName()+" got lock on Integer");
			}
		}
	}

}
