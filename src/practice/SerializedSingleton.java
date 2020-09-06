package practice;

public class SerializedSingleton {
	
	private SerializedSingleton(){
		
	}
	
	public static SerializedSingleton getInstance(){
		return SerializedSingletonHelper.INSTANCE;
	}
	
	
	private static class SerializedSingletonHelper{
		
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	

}
