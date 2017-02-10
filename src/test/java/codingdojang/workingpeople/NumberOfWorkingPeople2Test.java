package codingdojang.workingpeople;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by NAVER on 2017-02-10.
 */
public class NumberOfWorkingPeople2Test {
	private static final String FILE_PATH = "./src/test/resources/work_time2.txt";

	private NumberOfWorkingPeople2 numberOfWorkingPeople = new NumberOfWorkingPeople2();
	@Test
	public void test() {
		numberOfWorkingPeople.init(FILE_PATH);

		String stdTimeString = "00:00:15";
		assertEquals(1, numberOfWorkingPeople.getWorkingPeople(stdTimeString));

		stdTimeString = "00:00:25";
		assertEquals(2, numberOfWorkingPeople.getWorkingPeople(stdTimeString));

		stdTimeString = "00:00:30";
		assertEquals(3, numberOfWorkingPeople.getWorkingPeople(stdTimeString));

		stdTimeString = "00:10:15";
		assertEquals(1, numberOfWorkingPeople.getWorkingPeople(stdTimeString));

		stdTimeString = "00:10:25";
		assertEquals(2, numberOfWorkingPeople.getWorkingPeople(stdTimeString));

		stdTimeString = "00:10:30";
		assertEquals(3, numberOfWorkingPeople.getWorkingPeople(stdTimeString));

		stdTimeString = "01:10:15";
		assertEquals(1, numberOfWorkingPeople.getWorkingPeople(stdTimeString));

		stdTimeString = "01:10:25";
		assertEquals(2, numberOfWorkingPeople.getWorkingPeople(stdTimeString));

		stdTimeString = "01:10:30";
		assertEquals(3, numberOfWorkingPeople.getWorkingPeople(stdTimeString));
	}
}