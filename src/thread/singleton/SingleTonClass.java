package thread.singleton;

public class SingleTonClass {
	
	private  static volatile  SingleTonClass instance;
	
	private SingleTonClass(){
		
	}
	
	
	public  static SingleTonClass getInstance(){
		 if(instance == null){
			 instance= new SingleTonClass();
		 }
		 return instance;
	}
	

}
