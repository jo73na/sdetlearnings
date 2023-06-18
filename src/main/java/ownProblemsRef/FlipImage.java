package ownProblemsRef;

import java.util.Arrays;

public class FlipImage {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1 };

		int num1[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

		int num[][] = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
		
		
	
		int[][] flipEntireImageBidirectional = flipEntireImageBidirectional(num1);
		for (int[] is : flipEntireImageBidirectional) {
			System.out.println(Arrays.toString(is));
		}

	}

	public static int[][] flipEntireImageBidirectional(int[][] image) {

		int left = 0;
		int right = image.length - 1;
		while (left <= right) {
			if (left == right) {
				flipImageBidirectional(image[left++]);
				break;
			} else {
				flipImageBidirectional(image[left++]);
				flipImageBidirectional(image[right--]);
			}
		}
		return image;
	}

	public static int[] flipImageBidirectional(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {

			if (left == right) {
				invert(nums, left);
				break;
			} else {
				swap(nums, right, left);
				invert(nums, left);
				invert(nums, right);
			}

			right--;
			left++;

		}
		return nums;
	}

	private static void invert(int[] nums, int digit) {
		nums[digit] = (nums[digit] == 1) ? 0 : 1;
	}

	public static void swap(int[] nums, int right, int left) {
		int temp = nums[right];
		nums[right] = nums[left];
		nums[left] = temp;
	}

}
