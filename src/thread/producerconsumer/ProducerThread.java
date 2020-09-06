package thread.producerconsumer;

import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerThread extends Thread{

	BlockingQueue<Message> msgqueue;

	ProducerThread(BlockingQueue msgqueue){
		this.msgqueue=msgqueue;
	}

	private void produce(){
		synchronized (msgqueue) {
			System.out.println("producer is producing");


			for(int i=0;i<6;i++){
				Message msg = new Message();
				msg.setMsg(""+i);
				try {
					msgqueue.put(msg);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			msgqueue.notify();
		}

	}

	public void run(){
		produce();

	}

}
