package meetproblems;

import java.util.Arrays;
import java.util.Iterator;

public class LargestPositiveIntegerWithoutHash {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 4, 6, 7, 10 };
		int diff = 3;
		int count = 0;
		boolean[] arr = new boolean[14];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]] = true;
		}
		for (int i = 0; i < nums.length; i++) {
			if (arr[nums[i] + diff] == true && arr[nums[i] + 2 * diff] == true) {
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
}
