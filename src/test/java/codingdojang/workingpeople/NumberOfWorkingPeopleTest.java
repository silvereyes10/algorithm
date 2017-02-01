package codingdojang.workingpeople;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by NAVER on 2017-02-01.
 */
public class NumberOfWorkingPeopleTest {
	private NumberOfWorkingPeople numberOfWorkingPeople = new NumberOfWorkingPeople();

	private static final String FILE_PATH = "./src/test/resources/work_time.txt";

	@Test
	public void testCountPeopleOfThatTime() throws Exception {
		String stdTimeString = "11:00:00";
		assertEquals(3, numberOfWorkingPeople.getCountPeopleOfThatTime(FILE_PATH, stdTimeString));

		stdTimeString = "13:00:00";
		assertEquals(1, numberOfWorkingPeople.getCountPeopleOfThatTime(FILE_PATH, stdTimeString));

		stdTimeString = "00:00:00";
		assertEquals(0, numberOfWorkingPeople.getCountPeopleOfThatTime(FILE_PATH, stdTimeString));

	}

}