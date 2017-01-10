package codingdojang;

/**
 * Created by NAVER on 2017-01-04.
 */
public class NumberCounter {
	private int count = 0;

	public int getCount(int endNumber) {
		if (endNumber <= 10) {
			return 1;
		}

		int dividedCount = endNumber / 10;

		count += getCount(dividedCount) * dividedCount;

		System.out.println(count);
		return count;
	}

	public static void main(String args[]) {
		NumberCounter numberCounter = new NumberCounter();
		numberCounter.getCount(100);
	}
}
