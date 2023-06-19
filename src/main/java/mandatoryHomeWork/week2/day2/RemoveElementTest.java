package mandatoryHomeWork.week2.day2;

import java.util.Arrays;

public class RemoveElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int removeElement = removeElement(num, 2);
		System.out.println(Arrays.toString(num));
		System.out.println(removeElement);
	}

	public static int removeElement(int[] nums, int val) {
		 int left = 0;
			int right = 0;
	        while( right < nums.length ){
	            if (nums[right] != val){
	               swap(nums, left, right);
					left++;
	            }
				/*
				 * if (nums[right] == val && right == nums.length-1){ nums= Arrays.copyOf(nums,
				 * nums.length-1); }
				 */
				 right++;
	        }
	     //   int[] copyOf = Arrays.copyOf(nums, left);
	       //System.out.println(Arrays.toString(copyOf));
	        return left;
	}

	public static void swap(int[] nums, int slow, int fast) {
		nums[slow] = nums[fast];
	}
	
	public static int nameCalvin(int[] nums, int val) {
int left = 0, right = nums.length - 1;
        
        while(left<=right){
            if(nums[left]==val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }else{
                left++;
            }
            
        }
        
        return left;

	}

}
