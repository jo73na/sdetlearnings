package ownLearningsAlgorithm;
import java.util.Arrays;
public class BubbleSortAlgorithm {
	public static void bubble(int[] arr) {
		int n = arr.length;//5
		boolean isSwapped;
		for (int i = 0; i <= n; i++) {//pass main 
			isSwapped = false;
			//n-1
			for (int j = 1; j < n - i; j++) {//
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) {
				System.out.println("swapped= " + isSwapped);
				System.out.println(Arrays.toString(arr));
				System.out.println("<--------------break -------------->");
				break;
			}
		}
	}
	public static void main(String[] args) {
		int arr1[] = { -1, -4, -6, 76, 43, 12 };
		int arr[] = { 1, 2, 4, 3, 5 };
		bubble(arr1);
	}
}
