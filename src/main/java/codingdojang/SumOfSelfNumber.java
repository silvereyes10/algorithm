package codingdojang;

import com.google.common.collect.Sets;

import java.util.Set;


/**
 * Created by 남세 on 2017-01-15.
 */
public class SumOfSelfNumber {
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
		Set<Integer> numberSet = getNumberSet(5000);
		Set<Integer> resultSet = getGenerateSet(5000);

		Set<Integer> selfNumberSet = Sets.difference(numberSet, resultSet);
		System.out.println(getSumOfSelfNumber(selfNumberSet));
	}
}