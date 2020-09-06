package thread.singleton;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import thread.threadpool.MyCallable;

public class SingleTonTest {
	
	
	public static void main(String[] args){
		
		/*ExecutorService executor = Executors.newFixedThreadPool(7);
		
		SingleTonTestThread[] jobs = {new SingleTonTestThread("job 1"),
				new SingleTonTestThread("job 2"),
				new SingleTonTestThread("job 3"),
				new SingleTonTestThread("job 4"),
				new SingleTonTestThread("job 5"),
				new SingleTonTestThread("job 6")};*/
		
		
		SingleTonTestThread futureTask1 = new SingleTonTestThread("job 1");
		SingleTonTestThread futureTask2 = new SingleTonTestThread("job 2");
		SingleTonTestThread futureTask3 = new SingleTonTestThread("job 3");
		SingleTonTestThread futureTask4 = new SingleTonTestThread("job 4");
		Thread t1=new Thread(futureTask1);
		Thread t2=new Thread(futureTask2);
		Thread t3=new Thread(futureTask3);
		Thread t4=new Thread(futureTask4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		/*for(SingleTonTestThread job : jobs){

			Future<SingleTonClass> result=executor.submit(job);
			try {
				SingleTonClass obj = result.get();
				
				System.out.println("hashcode "+obj.hashCode());
				
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		executor.shutdown();*/
	}

}
