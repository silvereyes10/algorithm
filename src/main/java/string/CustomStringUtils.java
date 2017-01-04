package string;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by NAVER on 2016-12-27.
 */
public class CustomStringUtils {
    private Set<Character> characterSet = new HashSet<>();

    public boolean isContainChar(Character character) {
        if (character == null) {
            return false;
        }

        return characterSet.contains(character);
    }

    public void put(Character character) {
        characterSet.add(character);
    }

    public String getReverseString(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = text.length() - 1; i > -1; i--) {
            stringBuilder.append(text.charAt(i));
        }

        return stringBuilder.toString();
    }

    public boolean isAnagram(String text1, String text2) {
        char[] orderedText1 = text1.toLowerCase().toCharArray();
        Arrays.sort(orderedText1);
        char[] orderedText2 = text2.toLowerCase().toCharArray();
        Arrays.sort(orderedText2);

        return StringUtils.equalsIgnoreCase(new String(orderedText1), new String(orderedText2));
    }

    public String compress(String targetString) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] targetStringArray = targetString.toCharArray();

        char buffer = targetStringArray[0];
        int count = 1;

        for (int i = 1; i < targetStringArray.length; i++) {
            if (buffer == targetStringArray[i]) {
                count++;
            } else {
                stringBuilder.append(buffer + "" + count);
                buffer = targetStringArray[i];
                count = 1;
            }
        }

        return stringBuilder.append(buffer + "" + count).toString();
    }
}
