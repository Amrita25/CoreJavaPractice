package thread.waitnotifier;

import java.util.LinkedList;

public class BlockingQueue<T> {
	
	private LinkedList<T> list = new LinkedList();
	
	private int limit = 10;
	
	public synchronized void put(T item) {
		
		if(list.size() == limit){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(list.isEmpty()){
			notifyAll();
		}
		list.add(item);
	}
	
	public synchronized T take(){
		
		if(list.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(list.size() == limit){
			notifyAll();
		}
		list.remove(0);
		
		return list.remove(0);
		
	}

}
