package ownProblemsRef;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArrayInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int		nums[] = {0,1,2,3,4}; int[] index = {0,1,2,2,1};
int[] createTargetArray = createTargetArray(nums, index);
System.out.println(Arrays.toString(createTargetArray));	}

	public static int[] createTargetArray(int[] nums, int[] index) {
if(index.length<=1) {
	return nums;
}
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < index.length; i++) {
			ar.add(index[i], nums[i]);
		}
		int[] target = new int[index.length];
		for (int i = 0; i < target.length; i++) {
			target[i] = ar.get(i);

		}

		return target;

	}

}
