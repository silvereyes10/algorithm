package string;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by NAVER on 2016-12-27.
 */
public class CustomStringUtilsTest {
    private CustomStringUtils customStringUtils = new CustomStringUtils();

    @Test
    public void testReverseString() throws Exception {
        String sampleText = "abcdefghijklnm";

        String reverseString = customStringUtils.getReverseString(sampleText);

        assertEquals(reverseString, "mnlkjihgfedcba");
    }

    @Test
    public void testUniqueCharacter() throws Exception {
        String sampleText = "abcdefg";
        boolean isUniqueCharacter = true;

        for (int i = 0; i < sampleText.length(); i++) {
            char character = sampleText.charAt(i);
            if (customStringUtils.isContainChar(character)) {
                isUniqueCharacter = false;
                break;
            } else {
                customStringUtils.put(character);
            }
        }

        assertTrue(isUniqueCharacter);
    }

    @Test
    public void testIsAnagram() throws Exception {
        String text1 = "cbDA";
        String text2 = "dBaC";

        assertTrue(customStringUtils.isAnagram(text1, text2));
    }

    @Test
    public void testCompress() throws Exception {
        String targetString = "aaaabbcccdaaaabd";

        assertEquals("a4b2c3d1a4b1d1", customStringUtils.compress(targetString));

        targetString = "abbcccddddeeeeeffffff";

        assertEquals("a1b2c3d4e5f6", customStringUtils.compress(targetString));

    }
}