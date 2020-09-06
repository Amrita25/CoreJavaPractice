package thread.deadlock;

public class DeadLockTest {
	
	public static void main(String [] args){
		
		DeadLock t1= new DeadLock("thread 1");
		
		DeadLock t2= new DeadLock("thread 2");
		
		t1.start();
		t2.start();
	}
	
	

}
