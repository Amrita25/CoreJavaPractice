package thread.threadlocal;

public class CustomerThread extends Thread{
	
	static int custid=0;
	
	private static ThreadLocal tl = new ThreadLocal(){
		
		@Override
		public Object initialValue(){
			return (++custid);
		}
	};

	
	public CustomerThread(String name){
		super(name);
	}
	@Override
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//custid++;
		System.out.println(Thread.currentThread().getName()+"  "+tl.get());
	}
	

}
