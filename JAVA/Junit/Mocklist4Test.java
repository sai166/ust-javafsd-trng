package Testing;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;


public class Mocklist4Test {
	
	@SuppressWarnings("Unchecked")

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//using Mockito.mocj() method
		System.out.println("Hi");
		List<String> mockList = mock(List.class);
		
		when(mockList.size()).thenReturn(5);
		assertTrue(mockList.size()==5);
	System.out.println("world");	
	}

}
