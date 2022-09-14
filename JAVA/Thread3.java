package Thread;

public class Thread3  implements Runnable{
	
	public static void main(String[] args) {
		
		Runnable r=new Thread3();
		r.run();
	}
	@Override
	public void run(){
		System.out.println("Doing heavy processing-START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			//Get database connection,deleted unused data from the db
			doDBProcessing();
		}
		catch(InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing-END"+Thread.currentThread().getName());
	}
	private void doDBProcessing()throws InterruptedException{
		Thread.sleep(50000);
	}
	
}

