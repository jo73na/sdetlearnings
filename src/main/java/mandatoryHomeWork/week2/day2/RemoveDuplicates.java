package mandatoryHomeWork.week2.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int removeDuplicates = removeDuplicates(nums);
		System.out.println(removeDuplicates);

	}

	public static int removeDuplicates(int[] nums) {
		int x = 1;
		for (int y = x; y < nums.length; y++) {
			if (nums[y] > nums[x - 1]) {
				nums[x] = nums[y];
				x++;
			}
		}
		System.out.println(Arrays.toString(nums));
		int[] copyOf = Arrays.copyOf(nums, x);
		System.out.println("--------");
		System.out.println(Arrays.toString(copyOf));
		return x;
	}

	

}
