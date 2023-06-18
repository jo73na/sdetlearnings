package ownLearningsAlgorithm;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { -1, -4, -6, 76, 43, 12 };
		sortAlgo(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void sortAlgo(int[] arr, int low, int hi) {
		if (low >= hi) {
			return;
		}

		int s = low;
		int e = hi;
		int m = s + (e - s) / 2;
		int pivot = arr[m];

		while (s <= e) {

		while (arr[s] < pivot) {
				s++;
			}
		while (arr[e] > pivot) {
				e--;
			}
			if (s <= e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}

		}
sortAlgo(arr, low, e);
sortAlgo(arr, s, hi);
	}

}
