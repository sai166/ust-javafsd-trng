package Thread;

public class Thread4  extends Thread{
	

	public static void main(String[] args) {
	
	
		
		String name="AMML";
		Thread4 r=new Thread4(name);
		r.run();
		
	}
	public Thread4(String name) {
		super(name);
	}
	@Override
	public  void run() {
		System.out.println("My Thread -STRAT"+Thread.currentThread().getName());
	
		try {
			Thread.sleep(10000);
			//Get database connection ,delete unused data from DB
			doDBProcessing();
		
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread-END"+Thread.currentThread().getName());
	}
	private void doDBProcessing()throws InterruptedException{
		Thread.sleep(9000);
		
	}

}
