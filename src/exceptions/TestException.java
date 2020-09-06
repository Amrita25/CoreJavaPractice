package exceptions;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TestException test = new TestException();
			test.foo();
			
		} catch (IOException e) {
			e.printStackTrace();
		}catch(JAXBException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			System.out.println("null pointer exeption !!");
			e.printStackTrace();
		}catch(Exception e){
			e = new Exception("");
			e.printStackTrace();
		}
	}

	public void foo() throws IOException,JAXBException{
		
	}
}
