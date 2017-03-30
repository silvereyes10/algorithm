package codingdojang.twoprinters;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by NAVER on 2017-03-23.
 */
public class TwoPrinters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("input data:");
		String inputString = input.nextLine();
		String[] inputValue = StringUtils.split(inputString);

		double x = Double.parseDouble(inputValue[0]);
		double y = Double.parseDouble(inputValue[1]);
		double n = Double.parseDouble(inputValue[2]);

		System.out.println(getHarmonicAverage(x, y, n));
	}

	private static double getHarmonicAverage(double x, double y, double n) {
		double harmonicAverage = (n / ((1 / x) + (1 / y)));
		return harmonicAverage;
	}
}
