package codingdojang;

import com.google.common.collect.Sets;

import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by 남세 on 2017-01-15.
 */
public class SumOfSelfNumber {
	public static int getRangeSum(int start, int end) {
		return IntStream.range(start, end).sum();
	}

	public static Set<Integer> getNumberSet(int endNumber) {
		Set<Integer> numberSet = Sets.newHashSet();
		for (int i = 1; i < endNumber; i++) {
			numberSet.add(i);
		}

		return numberSet;
	}

	public static Set<Integer> getGenerateSet(int endNumber) {
		Set<Integer> resultSet = Sets.newHashSet();
		int number = 1;

		int result = calculateNumber(number);
		while (result < endNumber) {
			resultSet.add(result);
			result = calculateNumber(++number);
		}

		return resultSet;
	}

	public static int calculateNumber(int number) {
		int sum = number;

		while (number >= 10) {
			sum += (number % 10);
			number /= 10;
		}

		return sum + number;
	}

	public static int getSumOfSelfNumber(Set<Integer> resultSet) {
		return resultSet.stream().reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		Set<Integer> resultSet = getGenerateSet(5000);

		// case 1 : 1이상 ~ 5000 미만의 Set과 비교하여, 차이를 갖는 Set을 구함. 이후 합을 계산
		Set<Integer> numberSet = getNumberSet(5000);
		Set<Integer> selfNumberSet = Sets.difference(numberSet, resultSet);
		System.out.println("Sum of SelfNumber : " + getSumOfSelfNumber(selfNumberSet));

		// case 2 : 1이상 ~ 5000 미만의 합에서, Generator를 갖는 수의 합을 뺌.
		int numberSum = getRangeSum(1, 5000);
		System.out.println("Sum of SelfNumber : " + (numberSum - getSumOfSelfNumber(resultSet)));
	}
}