package meetproblems;

import java.util.Arrays;

public class LargestPositiveInteger {

	public static void main(String[] args) {
	int[]	nums = {-1,10,6,7,-7,1};
	//-7,-1,1,6,7,10
	
int findMaxK = findMaxK(nums);
System.out.println(findMaxK);
	}
	 public static int findMaxK(int[] nums) {
		 Arrays.sort(nums);
		int l=0;
		int r=nums.length-1;
		int max=nums[r];
		while (l<r) {
			if(-nums[l]==nums[r]) {
				return nums[r];
			}else if (-nums[l]>nums[r]) {
				l++;
			}else {
				r--;
			}
		}
		 
		 
		 
		 return -1;
	     
		 
		 
		 
	    }

}
