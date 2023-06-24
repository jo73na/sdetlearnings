package meetproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;

public class SquaretwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] sortedSquares = sortedSquares(nums);
		System.out.println(Arrays.toString(sortedSquares));
	}

	public static int[] sortedSquares(int[] nums) {
		int[] ans = new int[nums.length];
		int start = 0;
		int end = nums.length - 1;
		int setSmall = nums.length - 1;

		while (start <= end) {
			// comparing the squares of both pointer location elements
			if (nums[start] * nums[start] > nums[end] * nums[end]) {
				ans[setSmall] = nums[start] * nums[start];
				setSmall--;
				start++;
			} else {
				ans[setSmall] = nums[end] * nums[end];
				setSmall--;
				end--;
			}
		}

		return ans;

	}

	public static void sortedSquaresDes(int[] nums) {
		Integer[] ans = new Integer[nums.length];
		int start = 0;
		int end = nums.length - 1;
		TreeMap<Integer, Integer> tm = new TreeMap<>();

		while (start <= end) {
			tm.put(nums[start] * nums[start], 0);
			tm.put(nums[end] * nums[end], 0);
			start++;
			end--;
		}

		ans= (Integer[]) (tm.keySet()).toArray();

	}

}
