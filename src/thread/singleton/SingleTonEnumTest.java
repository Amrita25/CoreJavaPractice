package thread.singleton;

public class SingleTonEnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTonEnum obj = SingleTonEnum.INSTANCE;
		obj.setValue(2);
		System.out.println(obj);
		SingleTonEnum obj1 = SingleTonEnum.INSTANCE;
		obj1.setValue(3);
		System.out.println(obj.getValue());

	}

}
