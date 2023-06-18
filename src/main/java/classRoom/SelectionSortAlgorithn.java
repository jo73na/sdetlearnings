package classRoom;

import java.util.Arrays;

public class SelectionSortAlgorithn {
	
	/*
	 * 1.Set MAX to LAST location
	 * 2.Search the MAXIMUM element in the list
	 * 3.Swap with value at location MAX
	 * 4.Increment MAX to point to next element
	 * 5.Repeat until list is sorted
	 */

	public static void main(String[] args) {
		int[] arr = { 11, 4, 17, 18, 2, 22, 18 };
		algorith(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void algorith(int[] arr) {
		// iterating from 0-> array length
		for (int i = 0; i < arr.length; i++) {
			// calculate the last index to move the largest val to last index
			//	int last = arr.length  - 1; //			last-=i;
			int last = arr.length - i - 1;
			// get the max value in the array alway start from 0 since we are fill from last (bigger values)
			int maxIndex = getMaxIndex(arr, 0, last);
			// once we got the largest value between 0 and not filled last index swap it  from the current index to last
			getSwapped(arr, maxIndex, last);
			
		}
	}

	// array , max val current index, last index(current)
	// swapping function
	private static void getSwapped(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

//function to find the max value from 0 -> current last index in the array
	// initially assigning as first index -> as max index
	// iterating to get the max value start from 0->till current last
	// once max is found
	// assign to the index as max
	//return max
	private static int getMaxIndex(int[] arr, int start, int last) {
		int max = start;
		for (int j = start; j <= last; j++) {
			if (arr[j] > arr[max]) {
				max = j;
			}
		}
		return max;
	}

}
