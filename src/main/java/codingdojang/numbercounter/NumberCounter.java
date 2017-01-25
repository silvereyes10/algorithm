package codingdojang.numbercounter;

/**
 * Created by NAVER on 2017-01-04.
 */
public class NumberCounter {
	public int getCount(int endNumber) {
		if (endNumber <= 10) {
			return 1;
		}

		int count = 0;
		int dividedCount = endNumber / 10;

		count += getCount(dividedCount) * 10 + dividedCount;

		return count;
	}

	public static void main(String args[]) {
		NumberCounter numberCounter = new NumberCounter();
		numberCounter.getCount(10000);
	}
}
