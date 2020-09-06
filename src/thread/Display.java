package thread;

public class Display {



	public  void wish(String name){

		synchronized(this) {
			for(int i=0;i<5;i++){
				System.out.println("Good Morning !!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name);
			}
		}
	}

	public void print(String str){

		synchronized(this) {

			for(int i=0;i<3;i++){
				System.out.println("printing "+str);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}



	}

}
