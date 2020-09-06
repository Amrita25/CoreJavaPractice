package thread;

public class MyThread extends Thread{
	
	@Override
	public void start(){
		super.start();
		//System.out.println("inside start method");
	}

	@Override
	public void run(){
		
		//System.out.println("run method "+Thread.currentThread().getPriority());
		
		for(int i=0;i<3;i++){
			
			System.out.println("child thread run method "+Thread.currentThread().getName());
			//Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
