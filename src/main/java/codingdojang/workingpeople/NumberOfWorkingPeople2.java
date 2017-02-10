package codingdojang.workingpeople;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by NAVER on 2017-02-10.
 */
public class NumberOfWorkingPeople2 {
	private static String TIME_SEPARATOR = ":";

	private int[] workPeopleCountArray = new int[24 * 60 * 60];    // 24 * 60 * 60 = 86400

	public void init(String filePath) {
		try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
			stream.forEach(line -> countWorkPeopleToArray(line));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getWorkingPeople(String time) {
		return workPeopleCountArray[convertStringTimeToSecond(time)];
	}

	void countWorkPeopleToArray(String time) {
		String[] times = StringUtils.split(time);
		int startWorkTime = convertStringTimeToSecond(times[0]);
		int endWorkTime = convertStringTimeToSecond(times[1]);

		IntStream.rangeClosed(startWorkTime, endWorkTime).forEach(index -> ++workPeopleCountArray[index]);
	}

	int convertStringTimeToSecond(String time) {
		String[] times = StringUtils.split(time, TIME_SEPARATOR);
		return (Integer.parseInt(times[0]) * 24 * 60) + (Integer.parseInt(times[1]) * 60) + (Integer.parseInt(times[2]));
	}
}
