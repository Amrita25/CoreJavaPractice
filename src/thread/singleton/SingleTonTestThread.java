package thread.singleton;

import java.util.concurrent.Callable;

public class SingleTonTestThread implements Runnable{


	String name;

	SingleTonTestThread(String name){
		this.name=name;
	}

	@Override
	public void run(){
		System.out.println(name+" .. job started by ... Thread: "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SingleTonClass obj =SingleTonClass.getInstance();
		System.out.println("hashcodee : "+obj.hashCode());
	}



}
