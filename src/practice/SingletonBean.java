package practice;

public class SingletonBean {


	private static  final SingletonBean instance = new SingletonBean();//eager initialized


	public static SingletonBean getIstance(){
		return instance;
	}


	private SingletonBean(){

	}



}

class LazyInitializedSingleton {


	private static LazyInitializedSingleton instance=null;

	private LazyInitializedSingleton(){

	}


	public static LazyInitializedSingleton getIstance(){
		if(instance == null){
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}


}

class ThreadSafeSingleton{

	private static ThreadSafeSingleton instance=null;

	private ThreadSafeSingleton(){

	}

//costly because of cost associated with the synchronized method
	public static synchronized ThreadSafeSingleton getIstance(){
		if(instance == null){
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
		
		if(instance == null){
			
			synchronized (ThreadSafeSingleton.class) {
				if(instance == null){
					instance = new ThreadSafeSingleton();
				}
				
			}
		}
		return instance;
		
	}
	
	
}

