package thread.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread.currentThread().setDaemon(true);
		
		BlockingQueue<Message> msgqueue = new ArrayBlockingQueue<Message>(10);
		ProducerThread pr = new ProducerThread(msgqueue);
		ConsumerThread con = new ConsumerThread(msgqueue);
		pr.start();
		con.start();

	}

}
