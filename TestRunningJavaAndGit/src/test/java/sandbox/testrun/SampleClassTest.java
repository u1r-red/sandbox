package sandbox.testrun;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleClassTest {

	@Test
	public void testCalc() {
		int addingValue = 10;
		int addedValue = 11;
		SampleClass inst = new SampleClass();
		int result = inst.clac(addingValue);
		assertEquals(addedValue, result);
	}

}
