package Thread;

public class Exception9 implements  Runnable {
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("Current thread:"+t.getName());
		
		//chechs if current thread is allive
		System.out.println("Is Alive?"+t.isAlive());
	}
	
	

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
Thread t= new  Thread(new Exception9());
t.start();
System.out.println("Current thread");
//waits for 1000ms this tread to die
t.join(100);
System.out.println("\nJoining after 1000"+"milliseconds:\n");
System.out.println("Current thread:"+t.getName());


//checks if the thread is alive
System.out.println("Is alive?"+t.isAlive());
	}

}
