package classRoom;

public class CountOnesDivideAndConqurer {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 1, 1, 1 };
		int[] arr1 = { 0, 0, 0, 0, 0, 0, 0 };
		int[] arr2 = { 1, 1, 1, 1, 1, 1, 1 };
		int[] arr3 = {};

		int count = count(arr);
		System.out.println(count);
		System.out.println("-------------");
		int count1 = count(arr1);
		System.out.println(count1);
		System.out.println("-------------");
		int count2 = count(arr2);
		System.out.println(count2);
		System.out.println("-------------");
		int count3 = count(arr3);
		System.out.println(count3);
		System.out.println("-------------");
	}

	public static int count(int[] arr) {
		if (arr.length <= 0) {
			return -1;
		}
		int left = 0;
		int right = arr.length - 1;
		int count = 0;
		int mid = 0;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == 0) {
				left = mid + 1;
			} else if (arr[mid] == 1) {
				right = mid - 1;
			}
		}
		count = (arr.length - mid);
		return count;
	}
}
