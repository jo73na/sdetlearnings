package ownLearningsAlgorithm;
public class OrderAgnosticBS {
	public static int bsa(int[] arr, int target) {
		if (arr.length - 1 == 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 60, 110, 120, 130, 170 };
		int arrdes[] = { 77, 51, 50, 40, 30, 9, 8, 7, 6, 4, 3, 3, 2 };
		int target = 30;
		int ans = bsa(arrdes, target);
		System.out.println("Target "+target+" is at the position : "+ans);
		int ans1 = bsa(arr, target);
		System.out.println("Target "+target+" is at the position : "+ans1);

	}

}
