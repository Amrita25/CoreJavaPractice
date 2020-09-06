package thread;

public class MyDisplayThread2 extends Thread {


	Display dis;
	String name;	

	public MyDisplayThread2(Display dis,String name){
		this.dis=dis;
		this.name=name;
	}

	@Override
	public void run(){

		dis.print(name);
	}



}
