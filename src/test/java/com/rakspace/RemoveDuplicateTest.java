package com.rakspace;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.rakspace.util.DuplicateUtility;

public class RemoveDuplicateTest {

	@Test
	public void removeDuplicateWithNoData() {

		int array[] = {};
		int actualArraySizeResult = DuplicateUtility.removeDuplicates(array, array.length);
		int expectedArraySizeResult = 0;
		assertThat(actualArraySizeResult).isEqualTo(expectedArraySizeResult);
	}

	@Test
	public void removeWithDupliateData() {

		int array[] = { 7, 28, 28, 15, 15, 40, 90, 90, 45, 45, 99 };
		int actualArraySizeResult = DuplicateUtility.removeDuplicates(array, array.length);
		int expectedArraySizeResult = 7;
		assertThat(actualArraySizeResult).isEqualTo(expectedArraySizeResult);
	}

	@Test
	public void removeWithSortedDupliateData() {

		int array[] = { 7, 15, 15, 28, 28, 40, 45, 45, 90, 90, 99 };
		int actualArraySizeResult = DuplicateUtility.removeDuplicates(array, array.length);
		int expectedArraySizeResult = 7;
		assertThat(actualArraySizeResult).isEqualTo(expectedArraySizeResult);
	}

	@Test
	public void removeWithNoDupliateData() {

		int array[] = { 7, 15, 40, 90, 45, 99 };
		int actualArraySizeResult = DuplicateUtility.removeDuplicates(array, array.length);
		int expectedArraySizeResult = 6;
		assertThat(actualArraySizeResult).isEqualTo(expectedArraySizeResult);
	}

	@Test
	public void removeWithNegativeDupliateData() {

		int[] array = { -7, -7, 15, 40, 90, 45, 99 };
		int l = DuplicateUtility.removeDuplicates(array, array.length);
		int result[] = new int[l];
		for (int i = 0; i < l; i++) {
			result[i] = array[i];
		}
		int expectedResul[] = { -7, 15, 40, 90, 45, 99 };

		assertThat(result).isEqualTo(expectedResul);
	}

}
