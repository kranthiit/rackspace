package com.rakspace.service;

import org.springframework.stereotype.Service;
import com.rakspace.util.DuplicateUtility;
import com.rakspace.util.ReserveStringUtility;

@Service
public class RakSpaceService {

	public int[] process(int arr[]) {
		int n = arr.length;

		DuplicateUtility.removeDuplicates(arr, n);
		return arr;

	}

	public String reverseInfo(String inputData) {
		return ReserveStringUtility.reserve(inputData);
	}

}
