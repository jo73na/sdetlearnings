package ownProblemsRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum15 {

	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = threeSum(nums, 0);
		System.out.println(result);
	}
//o(n3)->o(n2)
	public static List<List<Integer>> threeSum(int[] nums, int target) {
		int len = nums.length;
		
		Set<List> result = new HashSet<>();
		if (nums == null || nums.length < 3)
			return new ArrayList<>(result);

		Arrays.sort(nums);
		for (int i = 0; i < len - 2; i++) {

			int left = i + 1;
			int right = len - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while (left < right && nums[left] == nums[left + 1])
						left++;

					while (left < right && nums[right] == nums[right - 1])
						right--;

					left++;
					right--;
				}
				else if (sum < 0)
					left++;
				else
					right--;
			}
		}
		return new ArrayList<>(result);
	}
}
