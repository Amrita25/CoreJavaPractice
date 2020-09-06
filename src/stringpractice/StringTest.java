package stringpractice;

import java.util.Arrays;

public class StringTest {
	
	
	private static void method1(){
		String s1= new String("amrita");
		String s2= s1.toUpperCase();
		String s3=s1.toLowerCase();
		String s4= s2.toLowerCase();
		
		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("s1==s3 "+(s1==s3));//as there is no change in the content of s1 , no new object will be created in heap memory
		System.out.println("s1==s4 "+(s1==s4));//as there is change in the content of s2 ,new object will be created in heap memory
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		method1();
		
		/*char[] arr1={'a','b'};
		char[] arr2={'c','d'};
		
		char buf[]=Arrays.copyOf(arr1, arr2.length+arr1.length);
		
		System.arraycopy(arr2, 0, buf, arr1.length, arr1.length);
		
		System.out.println(buf);
		
		String s= new String("abc");
		
		String s1="abc";
		s=s.intern();
		System.out.println(s==s1);*/

	}

}
