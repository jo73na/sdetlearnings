package ownProblemsRef;

import java.util.Arrays;

public class LeftRightSumDifferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,4,8,3};
		int[] leftRightDifference = leftRightDifference(nums);
	//	System.out.println(Arrays.toString(leftRightDifference));
		
	}
	//[10,4,8,3]
	//{1,2,3,4}-> {0-1,1-1,2-1,3-1}->{0,10+0,4+10+0,14+8}->{0,10,14,22}
	//15,1,11,22
	 public static int[] leftRightDifference(int[] nums) {
		 
		
		int[] leftSum= new int[nums.length];
		int[] rightSum= new int[nums.length];
		int[] ans= new int[nums.length];
		 if(nums.length<=1 ) {
			 return ans;
			 }
		leftSum[0]=0;
		for (int i = 1; i < leftSum.length; i++) {
			leftSum[i]=leftSum[i-1]+nums[i-1];	
		}

		int len=nums.length-1;
		rightSum[len]=0;
		System.out.println(len);
		for (int i = len-1; i >=0 ; i--) {
			rightSum[i]=rightSum[i+1]+nums[i+1];	
		
		}
		System.out.println("r"+Arrays.toString(rightSum));
		for (int i = 0; i < rightSum.length; i++) {
			ans[i]=(leftSum[i]>rightSum[i])?(leftSum[i]-rightSum[i]):(rightSum[i]-leftSum[i]);
			
		}

		 return ans;
	        
	    }

}
