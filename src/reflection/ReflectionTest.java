package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectionTest {
	
	private static Map<String,String> methodMap=new HashMap<String, String>();
	private static Map<String,String> flowervalueMap=new HashMap<String, String>();
	
	private static void populateMap(){
		methodMap.put("flowerName","setFlowerName");
		methodMap.put("flowerColor","setFlowerColor");
		methodMap.put("print","print");
		
		flowervalueMap.put("setFlowerName", "Chandramallika");
		flowervalueMap.put("setFlowerColor", "White");
	}
	
	private static void  method1() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Flower f = new Flower("Lilli", "Red", false);
		populateMap();
		
		Method[] methods = Flower.class.getMethods();
		
		Field[] fields = Flower.class.getDeclaredFields();

		for(Field field : fields){
			if(methodMap.get(field.getName()) != null){
				
				invokeMethod(f,methods,methodMap.get(field.getName()));
			}
		}
		invokePrintMethod(f);
	}
	
	private static void invokePrintMethod(Flower f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method[] methods = Flower.class.getDeclaredMethods();
		for(Method method : methods){
			if("print".equals(method.getName())){
				method.setAccessible(true);
				System.out.println(method.invoke(f));
			}
		}
	}
	
	private static void invokeMethod(Flower f,Method[] methods,String methodName) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		for(Method method : methods){
			if(methodName.equals(method.getName())){
				method.invoke(f,flowervalueMap.get(method.getName()));
			}
		}
		
		
	}
	
	public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		/*int count=0;
		
		Class clazz = Class.forName("java.lang.String");
		
		for(Method m : clazz.getDeclaredMethods()){
			count++;
			System.out.println(m.getName());
		}
		
		System.out.println("number of methods : "+count);*/
		
		method1();
	}

}
