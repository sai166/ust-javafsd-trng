package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Thread.Collection1;

public class Testcase1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		assertEquals(2,2);     //test case
		assertEquals(5,Collection1.calculate(2,3));  //test case
		
	
	}
	@Test(expected  =NullPointerException.class)
	
	public void test1() {
		String  s= null;
		assertEquals("ABC",s.toUpperCase());   //test case1
	}
	
	@After
	public void after() {
		System.out.println("in after");
		
	}
	@Before
	public void before() {
		System.out.println("In before");
	}
	
	@AfterClass
	public  static void afterclass() {
		System.out.println("In after class");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("In before class");
	}

}
