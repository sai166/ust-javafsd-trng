package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Mockito5Test {
	
	@Mock
	List<String>mockList;
	
	@BeforeEach
	public void setup() {
		//if we dont call belwo ,we will getn NullPointerException
		
		MockitoAnnotations.initMocks(this);
	}
	@SuppressWarnings("unchecked")


	@Test
	public void test() {
		
		System.out.println("Hi");
		when(mockList.get(0)).thenReturn("Sample");
		assertEquals("Sample",mockList.get(0));
		System.out.println("world");
		
		
		fail("Not yet implemented");
	}

}
