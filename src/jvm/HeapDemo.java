package jvm;

public class HeapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long mb=1024*1024;
		
		Runtime r =Runtime.getRuntime();
		System.out.println("max memory "+r.maxMemory()/mb);
		System.out.println("initial memory "+r.totalMemory()/mb);
		System.out.println("free memory "+r.freeMemory()/mb);
		System.out.println("consumed memory "+(r.totalMemory()-r.freeMemory())/mb);

	}

}
