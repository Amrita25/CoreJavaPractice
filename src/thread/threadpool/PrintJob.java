package thread.threadpool;

public class PrintJob implements Runnable{
	
	String name;
	
	PrintJob(String name){
		this.name=name;
	}

	@Override
	public void run(){
		
		System.out.println(name+" .. job started by ... Thread: "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
