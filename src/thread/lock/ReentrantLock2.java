package thread.lock;

import java.util.concurrent.locks.ReentrantLock;

import thread.Display;
import thread.MyDisplayThread;
import thread.MyDisplayThread2;

public class ReentrantLock2 {


	public static void main(String [] args){

		DisplayTryLock d= new DisplayTryLock();

		MyDisplayThreadTryLock t1 = new MyDisplayThreadTryLock(d,"ab");
		MyDisplayThreadTryLock2 t2 = new MyDisplayThreadTryLock2(d,"amri");

		t1.start();
		t2.start();


	}

}
