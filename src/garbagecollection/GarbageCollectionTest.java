package garbagecollection;

import java.util.Date;

public class GarbageCollectionTest {

	
	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		System.out.println("total memory "+r.totalMemory()); // 100 bytes
		System.out.println("free memory "+r.freeMemory()); // 80 bytes(20 bytes already used)
		
		for(int i =0; i<10000;i++){
			Date d = new Date();
			
			d=null;
		}
		//20 bytes allocated for 10000 objects. free memory 60 bytes
		System.out.println("after creating objects free memory "+r.freeMemory());
		r.gc();//requesting jvm to run gc
		
		//gc not yet run -> free memory 60 bytes
		//gc is run. and destroyed 5000 objects and freememory 70
		//gc is run. and destroyed all 10000 objects and freememory 80
		/*gc is run . at the beginnign 20 bytes was already used. in that 20 bytes there may be a chance of useless objects.
		then free memory becomes 90 bytes*/
		System.out.println("after garbage collection free memory "+r.freeMemory());
	}
	
	@Override
	public void finalize(){
		
		System.out.println("finalize method called ");
	}

}
