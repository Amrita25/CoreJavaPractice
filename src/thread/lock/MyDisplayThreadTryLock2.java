package thread.lock;

public class MyDisplayThreadTryLock2 extends Thread {


	DisplayTryLock dis;
	String name;	

	public MyDisplayThreadTryLock2(DisplayTryLock dis,String name){
		this.dis=dis;
		this.name=name;
	}

	@Override
	public void run(){

		dis.print(name);
	}



}
