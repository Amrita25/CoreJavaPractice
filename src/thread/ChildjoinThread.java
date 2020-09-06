package thread;

public class ChildjoinThread extends Thread {

	static Thread mainthread;

	@Override
	public void run(){

		//child thread will wait untill main thread completes
		try {
			mainthread.join();


			for(int i=0;i<5;i++){

				System.out.println("child thread");

				

			}
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}



}
