package ownLearningsAlgorithm;
public class OrderAgnosticBSVersion2 {
	public static int binarySearch(int[] arr, int target) {
	    int start = 0;
	    int end = arr.length - 1;

	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        if (arr[mid] == target) {
	            return mid;
	        }
	        if (arr[mid] < target) {
	            start = mid + 1;
	        } else {
	            end = mid - 1;
	        }
	    }
	    return -1;
	}


	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 60, 110, 120, 130, 170 };
		int arrdes[] = { 77, 51, 50, 40, 30, 9, 8, 7, 6, 4, 3, 3, 2 };
		int target = 30;
		int ans = binarySearch(arrdes, target);
		System.out.println(ans);
		int ans1 = binarySearch(arr, target);
		System.out.println(ans1);

	}

}
