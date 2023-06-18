package mandatoryHomeWork.week3.day1;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {3,1,2,4};
		int[] sortArrayByParity = sortArrayByParity(nums);
		System.out.println(Arrays.toString(sortArrayByParity));
	}
	
	  public static int[] sortArrayByParity(int[] nums) {
	        int left = 0, right = nums.length - 1;
	        while (left < right) {
	            if (nums[left] % 2 == 1) {
	                if (nums[right] % 2 == 0) {
	                    int temp = nums[left];
	                    nums[left] = nums[right];
	                    nums[right--] = temp;
	                } else {
	                    --right;
	                }
	            } else {
	                ++left;
	            }
	        }
	        return nums;
	    }

}
