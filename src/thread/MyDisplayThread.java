package thread;

public class MyDisplayThread extends Thread{
	
	Display dis;
	String name;	
	
	public MyDisplayThread(Display dis,String name){
		this.dis=dis;
		this.name=name;
	}
	
	@Override
	public void run(){
		dis.wish(name);
	}

}
