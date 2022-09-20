package Testing;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Mockito3 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		List<String> lst = new ArrayList<>();
		List<String> spyList =spy(lst);
		when(spyList.size()).thenReturn(5);
		spyList.add("sai");
		spyList.add("prasath");
		assertEquals("sai", spyList.get(0));
	}
    
}
