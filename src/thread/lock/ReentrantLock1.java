package thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {
	
	public static void main(String [] args){
		
		
		
		ReentrantLock l = new ReentrantLock(true);//setting fairness flag as true 
		
		l.lock();
		l.lock();
		System.out.println(l.isHeldByCurrentThread());
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());
		l.unlock();
		System.out.println(l.getHoldCount());
		l.unlock();
		System.out.println(l.getHoldCount());
	}

}
