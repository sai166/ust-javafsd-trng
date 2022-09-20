package Testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner1 {
	public static void main(String[] args) {
		
		
		Result r = JUnitCore.runClasses(Suite1.class);
		System.out.println(r.getRunCount());
		for(Failure f:r.getFailures()) {
			System.out.println(f);
			
		}
		
	}

}
