package codingdojang.numbercounter;

/**
 * Created by NAVER on 2017-01-04.
 */
public class EightCounter {
	public static void main(String[] args) {
		int number = 1;
		int count = 0;
		while (number <= 10000) {
			count += getCount(number);

			number++;
		}

		System.out.println(count);
	}

	private static int getCount(int number) {
		int count = 0;
		while (number > 10) {
			if (number % 10 == 8) {
				count++;
			}
			number /= 10;
		}

		if (number == 8) {
			count++;
		}

		return count;
	}
}
