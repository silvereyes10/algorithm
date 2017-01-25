package codingdojang.palindrom;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by NAVER on 2017-01-25.
 */

public class PalindromicNumberTest {
	PalindromicNumber palindromicNumber = new PalindromicNumber();

	@Test
	public void testGetPalindromicNumber() throws Exception {
		assertEquals(0, palindromicNumber.getPalindromicNumber(1));
		assertEquals(3, palindromicNumber.getPalindromicNumber(4));
		assertEquals(202, palindromicNumber.getPalindromicNumber(30));
		assertEquals(909, palindromicNumber.getPalindromicNumber(100));
		assertEquals(200000002, palindromicNumber.getPalindromicNumber(30000));
	}

	@Test
	public void testGetCountOfPalindromicNumber() throws Exception {
		assertEquals(10, palindromicNumber.getCountOfPalindromicNumber(1));
		assertEquals(19, palindromicNumber.getCountOfPalindromicNumber(2));
		assertEquals(10999, palindromicNumber.getCountOfPalindromicNumber(7));
		assertEquals(19999, palindromicNumber.getCountOfPalindromicNumber(8));
	}

	@Test
	public void testIsPalindromicNumber() {
		assertTrue(palindromicNumber.isPalindromicNumber(1234554321));
		assertTrue(palindromicNumber.isPalindromicNumber(123454321));

		assertFalse(palindromicNumber.isPalindromicNumber(12341));
	}

}