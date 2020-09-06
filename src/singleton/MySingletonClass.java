package singleton;

public class MySingletonClass {

	private MySingletonClass(){
		
	}
	
	private static class MySingletonHelperClass{
		
		private static final MySingletonClass INSTANCE = new MySingletonClass();
		
	}
	
	public static MySingletonClass getInstance(){
        return MySingletonHelperClass.INSTANCE;
    }

}
