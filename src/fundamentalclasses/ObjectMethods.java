package fundamentalclasses;

import java.util.Date;

public class ObjectMethods {
	
	public static void main(String [] args){
		
		String str1=new String("abc");
		str1=str1.intern();
		String str2=new String("abc");
		String str3="abc";
		
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass();
		//Strings that are equal have the same hascode value
		System.out.println("str1==str2 "+(str1==str2));
		System.out.println("str1.equals str2 "+(str1.equals(str2)));
		System.out.println("hash value of str1 "+str1.hashCode());
		System.out.println("hash value of str2 "+str2.hashCode());
		System.out.println("str1==str3 "+(str1==str3));
		System.out.println("str1.equals str3 "+(str1.equals(str3)));
		//////////////////////////////******************************************************////////////////////////////////////////////////////
		
		//the static factory valueOf method is generally a better choice
		
		Boolean bool1=Boolean.valueOf(true);
		Boolean bool2=Boolean.valueOf(true);
		Boolean bool3=new Boolean(true);
		Boolean bool4=true;
		System.out.println(bool3.toString());
		
		System.out.println("bool1.equals(bool2) "+bool1.equals(bool2));
		System.out.println("bool1 == bool2 "+(bool1 == bool2));
		System.out.println("bool1 == bool3 "+(bool1 == bool3));
		System.out.println("bool1 == bool4 "+(bool1 == bool4 ));
		
		Integer in1=23;
		Integer in2=Integer.valueOf("23");
		Integer in3 = Integer.valueOf("23");
		Integer in4=23;
		
		System.out.println(in2==in1);
		System.out.println("in2==in4 "+(in2==in4));
		// only one wrapper object per program if boxing is applied . 
		//Applicable to the  range Integer  -128 to 127
		Integer integer1=126;
		Integer integer2=Integer.valueOf("126");
		Integer integer3 = Integer.valueOf("126");
		//points to the same object as the values are same
		System.out.println(integer1==integer2);
		
		Integer integer4=1000;
		//Integer value of method This method will always cache values in the range -128 to 127.
	     //this method should generally be used in preference to the constructor.
		Integer integer5=Integer.valueOf(1000);

		//does not point to the same object though the values are same
		//because out of range(not within -128 to 127)
		System.out.println(integer4==integer5);
	}

}
