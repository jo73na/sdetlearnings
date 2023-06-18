package ownLearningsAlgorithm;
import java.util.Arrays;
public class InsertionSortAlgorithm {
	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}
	 static void swap(int[] arr, int first, int second) {
	        int temp = arr[first];
	        arr[first] = arr[second];
	        arr[second] = temp;
	    }
	public static void main(String[] args) {
		int arr[] = { -1, -4, -6, 76, 43, 12 };
		int worstCaseArr[] = { 5,4,3,2,1 };
		int bestCaseArr[]= {1,2,3,4,5};
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
