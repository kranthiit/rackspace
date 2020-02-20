package com.rakspace;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.rakspace.util.ReserveStringUtility;;

public class ReverseStringTest {

	@Test
	public void reverseString() {

		String actualString = "hello world";
		String expectedString = "world hello";

		String resultString = ReserveStringUtility.reserve(actualString);
		assertThat(resultString.trim()).isEqualTo(expectedString.trim());
	}

	@Test
	public void reverseStringWithSingleString() {

		String actualString = "helloworld";
		String expectedString = "helloworld";

		String resultString = ReserveStringUtility.reserve(actualString);
		System.out.println(resultString);
		assertThat(resultString.trim()).isEqualTo(expectedString.trim());
	}

}
