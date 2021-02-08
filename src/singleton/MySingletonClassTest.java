package singleton;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class MySingletonClassTest {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		/*MySingletonClass instanceOne = MySingletonClass.getInstance();
		MySingletonClass instanceTwo = null;
        try {
            Constructor[] constructors = MySingletonClass.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (MySingletonClass) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());*/
		
		Integer i=120;
		Integer j=120;
		System.out.println(i==j);
		i=300;
		j=300;
		System.out.println(i==j);
		
    }

}
