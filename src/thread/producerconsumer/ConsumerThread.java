package thread.producerconsumer;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class ConsumerThread extends Thread{

	BlockingQueue<Message> msgqueue;

	ConsumerThread(BlockingQueue msgqueue){
		this.msgqueue=msgqueue;
	}

	private void consume(){

		synchronized (msgqueue) {

			if(msgqueue.isEmpty()){
				try {
					System.out.println("Consumer is waiting");
					msgqueue.wait();
					System.out.println("Consumer wait is over and executing");
					for(Message msg : msgqueue){
						System.out.println(msg.getMsg());
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void run(){
		consume();
		System.out.println("end of consumption");
	}

}
