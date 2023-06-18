package mandatoryHomeWork.week3.day4;

import java.util.Arrays;

public final class MinimumDifferenceSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 9,4,1,7 };
		int k = 2;
		int minimumDifference = minimumDifference(nums, k);
		System.out.println(minimumDifference);
		int minimumDifference1 = minimumDifferenceSliding(nums, k);
		System.out.println("==============");
		System.out.println(minimumDifference1);
	}

	public static int minimumDifference(int[] nums, int k) {
		int min = Integer.MAX_VALUE;
		if (nums.length == 0 || nums.length == 1)
			return 0;
		for (int i = 0; i < nums.length; i++) {
			int sub = 0;
			int a, b;
			for (int j = i + 1; j < nums.length; j++) {
				a = (nums[i] > nums[j]) ? nums[i] : nums[j];
				b = (nums[i] < nums[j]) ? nums[i] : nums[j];
				sub = a - b;
				min = (min > sub) ? sub : min;
			}
		}

		return min;
	}

	public static int minimumDifferenceSliding(int[] nums, int k) {
		if (nums.length == 0 || nums.length == 1)
			return 0;
		Arrays.sort(nums); //=>nlogn
		int min = nums[0];
		int max = nums[k - 1];

		int minDiff = (max > min) ? max - min : min - max;
		;
		System.out.println("min: " + min + " max: " + max + " mindif: " + minDiff);

		for (int i = 1; i <= nums.length - k; i++) {
			int sub = 0;
			int a, b;
			min = nums[i];
			max = nums[i + k - 1];
			// System.out.println("min: "+min+" max: "+max);
			a = (max > min) ? max : min;
			b = (max < min) ? max : min;

			sub = a - b;

			minDiff = (minDiff > sub) ? sub : min;
			System.out.println("a: " + min + " b: " + max + " sub: " + sub + " mindif: " + minDiff);

		}

		return minDiff;
	}

}
