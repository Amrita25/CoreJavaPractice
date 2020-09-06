package thread.threadpool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{


	int num;

	MyCallable(int num){
		this.num=num;
	}

	@Override
	public Object call() throws Exception {


		System.out.println(" .. job started by callable... Thread: "+Thread.currentThread().getName());
		 int sum =0;
		 
		 for(int i =0;i<num;i++){
			 sum=sum+i;
		 }



		return sum;
	}

}
