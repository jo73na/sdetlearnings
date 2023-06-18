package ownProblemsRef;

import java.util.Arrays;

public class test2 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 1 };
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
		
			 if(arr[left] == 0) {
			        arr[left] = 1;
			    	left++;
			    } else {
			        arr[left] = 0;
			    	left++;
			    }
			    if(arr[right] == 0) {
			        arr[right] = 1;
			        right--;
			    } else {
			        arr[right] = 0;
			        right--;
			    }
			
				
		}
		System.out.println(Arrays.toString(arr));
	}
}
