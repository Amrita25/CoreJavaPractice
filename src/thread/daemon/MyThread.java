package thread.daemon;

public class MyThread extends Thread{
	
	@Override
	public void run(){
		System.out.println("inside my thread");
		
		for(int i=0;i<5;i++){
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Inside my thread "+i);
		}
		System.out.println("end of  my thread");
		
	}

	

}
