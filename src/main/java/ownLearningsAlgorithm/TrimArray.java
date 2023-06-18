package ownLearningsAlgorithm;

import java.util.Arrays;

public class TrimArray {

	public static void main(String[] args) {
		int[] digits = { 1, 2, 3,9,9,6,8 };
		int[] digits1 = { };
		int[] digits2 = { 9, 9 };
		
trim(digits1, 4);
	}
	
	static void trim(int[] arr, int len) {
		if(arr.length==0 ) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		
		int[] newArr= new int[len];
		for (int i = 0; i < len; i++) {
			newArr[i]=arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}

}
