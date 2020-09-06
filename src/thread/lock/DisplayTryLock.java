package thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DisplayTryLock {

	static ReentrantLock l = new ReentrantLock(true);

	public  void wish(String name){

		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName()+" got lock and performing safe operation wish ");
			//l.lock();
			for(int i=0;i<2;i++){
				System.out.println("Good Morning !!");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(name);
			}

			l.unlock();
			System.out.println(Thread.currentThread().getName()+" released lock in wish method");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" unable to get the lock in wish method");
		}

	}

	public void print(String str){


		//l.lock();
		try {
			if(l.tryLock(5000,TimeUnit.MILLISECONDS)){
				System.out.println(Thread.currentThread().getName()+" got lock and performing safe operation print method ");
				for(int i=0;i<3;i++){
					System.out.println("printing "+str);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				l.unlock();
				System.out.println(Thread.currentThread().getName()+" released lock in print method");
			}
			else {
				System.out.println(Thread.currentThread().getName()+" unable to get the lock in print method");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
