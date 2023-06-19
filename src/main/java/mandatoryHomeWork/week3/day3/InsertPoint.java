package mandatoryHomeWork.week3.day3;

public class InsertPoint {

	public static void main(String[] args) {
	int[]	nums = {1,3,5,6};
	int target = 5;
	int searchInsert = searchInsert(nums, target);
System.out.println(searchInsert);
	}

	public static int searchInsert(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			//int mid= (start+end)/2;
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}

			else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return start;
	}

}
