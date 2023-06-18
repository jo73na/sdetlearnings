package mandatoryHomeWork.week4.day1;

import java.util.HashMap;
import java.util.Set;

public class MarjorityOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int majorityElement = majorityElement(nums);
		int majorityElement1 = majorityElementHash(nums);
		System.out.println(majorityElement);
		System.out.println(majorityElement1);
	}

	public static int majorityElement(int[] nums) {
		return majority(nums, 0, nums.length - 1);
	}

	public static int majority(int[] nums, int lo, int hi) {
		if (lo == hi)
			return nums[lo];
		int mid = (hi - lo) / 2 + lo;

		int left = majority(nums, lo, mid);
		int right = majority(nums, mid + 1, hi);
		if (left == right)
			return left;

		int leftCount = freq(nums, left, lo, hi);
		int rightCount = freq(nums, right, lo, hi);
		return leftCount > rightCount ? left : right;
	}

	public static int freq(int nums[], int element, int lo, int hi) {
		int count = 0;
		for (int i = lo; i <= hi; i++) {
			if (nums[i] == element)
				count++;
		}
		return count;
	}

	public static int majorityElementHash(int[] nums) {
		int num = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			if (map.get(key) > nums.length / 2) {
				num = key;
			}
		}
		return num;
	}

}
