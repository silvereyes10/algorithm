package string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by NAVER on 2016-12-27.
 */
public class StringUtils {
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
}
