package thread.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*PrintJob[] jobs = {new PrintJob("job 1"),
				new PrintJob("job 2"),
				new PrintJob("job 3"),
				new PrintJob("job 4"),
				new PrintJob("job 5"),
				new PrintJob("job 6")};

		ExecutorService executor = Executors.newFixedThreadPool(3);

		for(PrintJob job : jobs){

			//executor.submit(job);
			executor.execute(job);
		}

		executor.shutdown();*/

		MyCallable [] callabletasks = {new MyCallable(3),
				new MyCallable(3),
				new MyCallable(4),
				new MyCallable(5),
				new MyCallable(2),
				new MyCallable(4)};

		ExecutorService executor = Executors.newFixedThreadPool(3);

		for(MyCallable job : callabletasks){

			Future<String> result=executor.submit(job);
			try {
				System.out.println("sum is : "+String.valueOf(result.get()));
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		executor.shutdown();
	}

}
