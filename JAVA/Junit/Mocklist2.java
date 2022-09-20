package Testing;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.MockAnnotationProcessor;

public class Mocklist2 {
	@Mock
	List<String> mocklist;
	
	
	@Before
	public void initialize()
	{
		
 MockitoAnnotations.initMocks(this);
		
	}
	

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		when(mocklist.get(0)).thenReturn("Sai");
		assertEquals("Sai",mocklist.get(0));
	
	
	
	}

}
