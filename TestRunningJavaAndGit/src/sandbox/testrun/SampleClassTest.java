package sandbox.testrun;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleClassTest {

	@Test
	public void testCalc() {
		SampleClass inst = new SampleClass();
		int result = inst.clac(10);
		assertEquals(11, result);
	}

}
