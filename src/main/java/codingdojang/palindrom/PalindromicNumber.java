package codingdojang.palindrom;

/**
 *  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, ... 과 같이,
 *  0 이상의 앞뒤가 같은 수를 크기 순으로 나열할 때, n 번째 수를 계산하는 프로그램을 작성하라.
 *
 *  n은 1부터 시작하며 크기에는 제한이 없다.
 *
 * Created by NAVER on 2017-01-25.
 */
public class PalindromicNumber {
	public boolean isPalindromicNumber(int number) {
		int digitOfNumber = (int)Math.log10(number);

		int firstEqualTarget;
		int secondEqualTarget;

		for (int i = 0; i < digitOfNumber / 2; i++) {
			firstEqualTarget = number / (int)Math.pow(10, digitOfNumber - (i * 2));
			secondEqualTarget = number % 10;

			if (Integer.compare(firstEqualTarget, secondEqualTarget) != 0) {
				return false;
			}

			number = number % (int)Math.pow(10, digitOfNumber - (i * 2)) / 10;
		}

		return true;
	}

	public int getCountOfPalindromicNumber(int n) {
		if (n % 2 == 0) {
			return 2 * (int)Math.pow(10, n / 2) - 1;
		}

		return 11 * ((int)Math.pow(10, (n - 1) / 2)) - 1;
	}

	public int getPalindromicNumber(int n) {
		if (n == 1) {
			return 0;
		}

		int i = 0;
		int palindromicNumberIndex;
		int number;

		while (true) {
			if (getCountOfPalindromicNumber(i + 1) > n) {
				palindromicNumberIndex = getCountOfPalindromicNumber(i);
				number =  (int)Math.pow(10, i);

				break;
			}
			i++;
		}

		while(true) {
			if (isPalindromicNumber(number)) {
				palindromicNumberIndex++;

				if (palindromicNumberIndex == n) {
					return number;
				}
			}

			number++;
		}
	}
}
