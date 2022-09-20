package Testing;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

public class Mocklist4 {

	@Test
	public void test_mockito_verify() {
		
		
		@SuppressWarnings("unchecked")
		List<String> mockedList = Mockito.mock(List.class);
		
		mockedList.add("first-element");
		mockedList.add("second-element");
		mockedList.add("third-element");
		mockedList.add("third-element");
		mockedList.clear();
		
		verify(mockedList).add("first-element");
		verify(mockedList).add("second-element");
		verify(mockedList,VerificationModeFactory.times(2)).add("third-element");
		
		
				
				verify(mockedList).clear();
		
	//	fail("Not yet implemented");
	}

}
