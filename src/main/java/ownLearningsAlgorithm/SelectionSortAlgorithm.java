package ownLearningsAlgorithm;

import java.util.Arrays;

public class SelectionSortAlgorithm {

	public static void selectionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			getSwapped(arr, maxIndex, last);

		}

	}

	private static void getSwapped(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	private static int getMaxIndex(int[] arr, int start, int last) {
		int max = start;
		for (int j = start; j <= last; j++) {
			if (arr[j] > arr[max]) {
				max = j;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 5,8,3,2,10 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
