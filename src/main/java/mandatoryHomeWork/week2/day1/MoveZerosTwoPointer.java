package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

public class MoveZerosTwoPointer {

	// initialize two pointers-> fast and slow = 0
	// if 0 is not found-> fast not equal to zero
	// swap all the non-zero into the front of nums using temp
	// continue the fast pointers.

	public static void main(String[] args) {
		int[] num={0,2,0,3,12};
		int[] moveZeros = moveZeros(num);
		System.out.println(Arrays.toString(moveZeros));

	}

	public static int[] moveZeros(int[] nums) {
		int fast = 0;
		int slow = 0;
		while (fast < nums.length) {
			if (nums[fast] != 0) {
				//call swap function
				swap(nums, slow, fast);
				slow++;
			}
			fast++;
		}
		return nums;

	}

	public static void swap(int[] nums, int slow, int fast) {
		int temp = nums[slow];
		nums[slow] = nums[fast];
		nums[fast] = temp;

	}

}
