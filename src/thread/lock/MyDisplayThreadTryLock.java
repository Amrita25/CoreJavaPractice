package thread.lock;

public class MyDisplayThreadTryLock extends Thread{
	
	DisplayTryLock dis;
	String name;	
	
	public MyDisplayThreadTryLock(DisplayTryLock dis,String name){
		this.dis=dis;
		this.name=name;
	}
	
	@Override
	public void run(){
		dis.wish(name);
	}

}
