package Testing;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Mockito6TestTest {

	@Test
	public void test() {
		
		
		//fail("Not yet implemented");
		
		List<String> list = new ArrayList<>();
		List<String> spyOnList = spy(list);
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10,spyOnList.size());
		//calling real methods since below methods are not stubbed
		
		spyOnList.add("hemanth");
		spyOnList.add("hanish");
		spyOnList.add("hemanth");
		spyOnList.get(0);
		assertEquals("hanish",spyOnList.get(0));
		
	}

}
