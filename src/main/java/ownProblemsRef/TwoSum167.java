package ownProblemsRef;

import java.util.Arrays;

public class TwoSum167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,7,11,15};
		//numbers = [2,7,11,15]
		Arrays.sort(numbers);
		int[] twoSum = twoSum(numbers, 9);
		System.out.println(Arrays.toString(twoSum));
	}

	public static int[] twoSum(int[] arr, int target) {
		int[] ans = new int[2];
		int left = 0;
		int right = arr.length-1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				ans[0] = left + 1;
				ans[1] = right + 1;
				break;
			} else if (sum > target) {
				right--;
			} else {
				left++;
			}
		}

		return ans;

	}

}
