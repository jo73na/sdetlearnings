package ownProblemsRef;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] arr = { 1,0,1 };
		
		/*
		 * int left = 0; int right = arr.length - 1; while (left < right) { invert(arr,
		 * left, right); left++; right--; } System.out.println(Arrays.toString(arr));
		 */
		
		
		int[] arr1 = {1, 0, 1, 1, 0};
		invert(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static void invert(int[] arr) {
	
	int left = 0;
	int right = arr.length - 1;

	while(left <= right ) {
	    // Swap 0 and 1 at the left and right pointers
		if(left==right) {
			 if(arr[left] == 0) {
			        arr[left] = 1;
			    } else {
			        arr[left] = 0;
			    }
			 break;
		}
		
	    if(arr[left] == 0) {
	        arr[left] = 1;
	    } else {
	        arr[left] = 0;
	    }
	    if(arr[right] == 0) {
	        arr[right] = 1;
	    } else {
	        arr[right] = 0;
	    }
	    // Move the left and right pointers towards each other
	    left++;
	  
	    right--;
	}
	}
	

}
