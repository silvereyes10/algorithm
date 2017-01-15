package codingdojang;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 남세 on 2017-01-15.
 */
public class SumOfSelfNumberTest {
	@Test
	public void testCalculateNumber() throws Exception {
		assertEquals(SumOfSelfNumber.calculateNumber(100), 101);
		assertEquals(SumOfSelfNumber.calculateNumber(91), 101);
	}
}