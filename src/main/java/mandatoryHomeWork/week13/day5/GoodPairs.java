package mandatoryHomeWork.week13.day5;

public class GoodPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 1, 1, 3 };
		int numIdenticalPairs = numIdenticalPairs(nums);
		System.out.println(numIdenticalPairs);
	}

	public static int numIdenticalPairs(int[] nums) {
		int len = nums.length - 1;
		int left = 0;
		int right = len;
		int ans = 0;
		while (left <= right) {
			if (nums[left] == nums[right] && left < right) {
				ans++;
				right--;
			} else if (nums[left] != nums[right]) {
				right--;
			} else if (left == right) {
				left++;
				right = len;
			}
		}
		// System.gc();
		return ans;
	}

}
