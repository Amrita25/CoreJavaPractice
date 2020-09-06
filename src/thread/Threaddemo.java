package thread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Threaddemo{


	

	public static void main(String [] args) throws InterruptedException{

		//mymethod2();
		//mymethod3();
		//mymethod4();
		//mymethod5();
		mymethod6();
		//mymethod7();
	}

	private  static void mymethod4() throws InterruptedException{

		Display d= new Display();

		MyDisplayThread t1 = new MyDisplayThread(d,"ab");
		MyDisplayThread t2 = new MyDisplayThread(d,"cd");
		
		t1.start();
		t2.start();
	}
	
	private  static void mymethod5() throws InterruptedException{

		Display d= new Display();

		MyDisplayThread t1 = new MyDisplayThread(d,"ab");
		MyDisplayThread2 t2 = new MyDisplayThread2(d,"amri");
		
		t1.start();
		t2.start();
	}
	
	private  static void mymethod6() throws InterruptedException{

		Display d1= new Display();
		Display d2= new Display();

		MyDisplayThread t1 = new MyDisplayThread(d1,"ab");
		MyDisplayThread t2 = new MyDisplayThread(d2,"amri");
		
		MyDisplayThread2 t3 = new MyDisplayThread2(d1,"ab");
		MyDisplayThread2 t4 = new MyDisplayThread2(d2,"amri");
		
		t1.start();
		t2.start();
	}
	
	private  static void mymethod7() throws InterruptedException{

		Display d1= new Display();
		Display d2= new Display();
		
		MyDisplayThread2 t1 = new MyDisplayThread2(d1,"ab");
		MyDisplayThread2 t2 = new MyDisplayThread2(d2,"amri");
		
		t1.start();
		t2.start();
	}

	private  static void mymethod3() throws InterruptedException{

		ChildjoinThread.mainthread=Thread.currentThread();
		ChildjoinThread t1 = new ChildjoinThread();
		t1.start();

		for(int i=0;i<3;i++){
			System.out.println("main method ");
			Thread.sleep(2000);
		}
	}

	private  static void mymethod2() throws InterruptedException{

		//System.out.println("Thread name : "+ Thread.currentThread().getName());

		MyThread t1= new MyThread();
		t1.setName("thread 1");
		
		MyThread t2= new MyThread();
		t2.setName("thread 2");
		
		MyThread t3= new MyThread();
		t3.setName("thread 3");
		//t1.setPriority(7);
		t1.start();
		t1.interrupt();
		
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
		
		

		//t1.join();//this line is executed by main thread. so main thread will enter waiting state untill t1 completes.
		//t1.join(2000);


		System.out.println("All threads are dead, executing main thread");
		for(int i=0;i<3;i++){
			System.out.println("main method ");
		}

		System.out.println("end of  main thread");
	}

}
