package Thread;

import java.lang.*;
public class Thread8  implements Runnable{
	Thread t;
	Thread8(String str){
	t=new Thread(this,str);
			t = new Thread(this,str);
		//this will can run() function
		t.start();
	}
	public void run() {
		for(int i =0; i<5;i++) {
			
			//yields control to another thread every 5 iterations
			
			if((i%5)==0) {
				System.out.println(Thread.currentThread().getName()+"yielding control...");
			
			/*cause the currently executing thread object to tempority
			 * pause and allow other threads to executr*/
			Thread.yield();
			
			 
		}
	}
	System.out.println(Thread.currentThread().getName()+"has finished executing.");	

}
public static void main(String[] args) {
new Thread8("Thread 1");
new Thread8("Thread 2");
new Thread8("Thread 3");
}
}
