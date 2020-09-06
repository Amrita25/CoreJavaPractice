package thread.threadlocal;

public class ParentThread extends Thread{
	
	public static ThreadLocal<String> tl = new ThreadLocal<>();
	
	public static Integer in = 4;
	
	public static InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal(){
		
		@Override
		public Object childValue(Object obj){
			
			return "Inherited Child";
		}
	};

	
	@Override
	public void run(){
		tl.set("parent");
		inheritableThreadLocal.set("Inherited Parent");
		System.out.println("Parent thread value > "+tl.get());
		System.out.println("Inherit Parent thread value >  "+inheritableThreadLocal.get());
		//System.out.println("in value "+in);
		
		ChildThread child = new ChildThread();
		child.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("after sleep Parent thread value "+tl.get());
		//System.out.println("after sleep in value "+in);
	}


	public ThreadLocal<String> getTl() {
		return tl;
	}

}

class ChildThread extends Thread{
	

	
	@Override
	public void run(){
		
		//ParentThread.tl.set("child");
		ParentThread.in=6;
		

		
		System.out.println("child thread value > "+ParentThread.tl.get());
		System.out.println("Inherit child thread value > "+ParentThread.inheritableThreadLocal.get());
		
		//System.out.println("child in value "+ParentThread.in);
		
		
	}
}
