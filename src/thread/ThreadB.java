package thread;

public class ThreadB extends Thread {

	int total=0;

	public void run(){

		synchronized (this) {

			System.out.println("Child thread CALCULATING");
			for (int i=1;i<=100;i++){
				total=total+i;
			}
			System.out.println("Child thread giving notification");
			this.notify();
		}
	}
}
