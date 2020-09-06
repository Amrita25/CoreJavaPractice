package thread.waitnotifier;

public class Waiter implements Runnable{

	private Message msg;
	
	public Waiter(Message m){
        this.msg=m;
    }




	public Message getMsg() {
		return msg;
	}



	public void setMsg(Message msg) {
		this.msg = msg;
	}


	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		synchronized (msg) {
			
			System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
			
			try {
				msg.wait();
				//Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            
            System.out.println(name+" processed: "+msg.getMsg());
			
			
		}
		
	}

}
