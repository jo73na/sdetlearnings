package ownProblemsRef;

public class MaxOnes {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		int count = findMaxConsecutiveOnes(nums);
		System.out.println(count);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int start = 0;
		int end;
		int max = Integer.MIN_VALUE;
		int count;

		for (end = 0; end < nums.length; end++) {
			if (nums[end] == 0) {
				start = end + 1;
			}
			count=end - start + 1;
			max=(max>count)?max:count;

		}
		return max;

	}
}
