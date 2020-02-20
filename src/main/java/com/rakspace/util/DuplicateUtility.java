package com.rakspace.util;

public class DuplicateUtility {

public static int removeDuplicates(int arr[], int end) {
if (end == 0 || end == 1)
return end;

int j = 0;

// Just maintaining another updated index i.e. j
for (int i = 0; i < end - 1; i++)
if (arr[i] != arr[i + 1])
arr[j++] = arr[i];

arr[j++] = arr[end - 1];

return j;
}

}