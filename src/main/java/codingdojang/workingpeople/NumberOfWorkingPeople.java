package codingdojang.workingpeople;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by NAVER on 2017-02-01.
 */
public class NumberOfWorkingPeople {
	public long getCountPeopleOfThatTime(String filePath, String stdTimeString) {
		try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
			return stream.map(WorkTime::new).filter(workTime -> workTime.isContainTime(stdTimeString)).count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
}

class WorkTime {
	private int startTime;
	private int endTime;

	public WorkTime(String workingTime) {
		String[] workingTimeStrings = StringUtils.split(workingTime);

		if (workingTimeStrings == null) {
			throw new IllegalArgumentException("Argument is abnormal.");
		}

		if (workingTimeStrings.length == 2) {
			startTime = convertStringTimeToInteger(workingTimeStrings[0]);
			endTime = convertStringTimeToInteger(workingTimeStrings[1]);
		}
	}

	public boolean isContainTime(String stdTimeString) {
		int stdTime = convertStringTimeToInteger(stdTimeString);

		return startTime < stdTime && stdTime < endTime;
	}

	public int convertStringTimeToInteger(String timeString) {
		return Integer.parseInt(StringUtils.replaceAll(timeString, ":", ""));
	}
}
