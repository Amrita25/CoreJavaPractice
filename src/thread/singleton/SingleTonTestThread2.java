package thread.singleton;

import java.util.concurrent.Callable;

public class SingleTonTestThread2 implements Callable<SingleTonClass>{


	String name;

	SingleTonTestThread2(String name){
		this.name=name;
	}

	@Override
	public SingleTonClass call() throws Exception {
		System.out.println(name+" .. job started by ... Thread: "+Thread.currentThread().getName());
		Thread.sleep(1000);
		return SingleTonClass.getInstance();
	}


}
