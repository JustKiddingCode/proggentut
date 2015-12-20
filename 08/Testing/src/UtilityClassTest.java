import static org.junit.Assert.*;

import org.junit.Test;


public class UtilityClassTest {
	@Test
	public void test() {
		assertEquals(UtilityClass.fib(0), 0);
		assertEquals(UtilityClass.fib(1), 1);
		assertEquals(UtilityClass.fib(2), 1);
		assertEquals(UtilityClass.fib(3), 2);
		assertEquals(UtilityClass.fib(4), 3);
		assertEquals(UtilityClass.fib(5), 5);
		assertEquals(UtilityClass.fib(6), 8);
		assertEquals(UtilityClass.fib(7), 13);
	}
	@Test
	public void testingE() {
		double e = UtilityClass.calcE(10);
		assertTrue("calcE(10) nicht im Bereich " + e,e <= 2.8 && 2.71 <= e);
	}

}
