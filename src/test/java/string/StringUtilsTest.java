package string;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by NAVER on 2016-12-27.
 */
public class StringUtilsTest {
	private StringUtils stringUtils = new StringUtils();

	@Test
	public void testReverseString() throws Exception {
		String sampleText = "abcdefghijklnm";

		String reverseString = stringUtils.getReverseString(sampleText);

		assertEquals(reverseString, "mnlkjihgfedcba");
	}

	@Test
	public void testUniqueCharacter() throws Exception {
		String sampleText = "abcdefg";
		boolean isUniqueCharacter = true;

		for (int i=0; i<sampleText.length(); i++) {
			char character = sampleText.charAt(i);
			if (stringUtils.isContainChar(character)) {
				isUniqueCharacter = false;
				break;
			} else {
				stringUtils.put(character);
			}
		}

		assertTrue(isUniqueCharacter);
	}
}