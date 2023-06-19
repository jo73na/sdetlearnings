package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class ArrayOperations {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 3, 4, 5, 5 };
		System.out.println(Arrays.toString(trim(input, 3)));
		System.out.println(" ---------------------------------");
		int[] input2 = { 1, 2, 3, 4, 5 };
		int[] input3 = {};
		System.out.println(convertString(input2));
		System.out.println(convertString(input3));
		System.out.println(" ---------------------------------");
		int[] input4 = { 1, 2, 4, 5, 6, 7 };
		int[] input5 = { 1, 2, 3, 4 };
		System.out.println(contains(input4, 4));
		System.out.println(contains(input5, 5));
		System.out.println(" ---------------------------------");
		int input6[] = { 1, 2, 3, 5, 6 };
		int input7[] = { 1 };
		int input8[] = {};
		addtoIndex(input6, 4, 3);
		addtoIndex(input7, 2, 1);
		addtoIndex(input8, 1, 0);
		System.out.println(" ---------------------------------");
		 int[] input9 = {1,2,3,4,5,5};
	       removeVal(input9,5);
	        removeVal(input9,6);
	}

	public static boolean contains(int[] arr, int value) {

		boolean flag = false;

		int left = 0, right = arr.length - 1;

		while (left <= right) {
			if (arr[left] == value || arr[right] == value) {
				flag = true;
				break;
			} else {
				++left;
				--right;
			}
		}

		return flag;

	}
	  public static void removeVal(int[] arr,int value){

	         int count = 0;

	        for (int a:arr) {
	            if(a == value) count++;
	        }

	        int[] newArr = new int[arr.length-count];
	        int newArrCount = 0;
	        for (int j=0;j<arr.length;j++ ) {
	            if(arr[j]!=value){
	                newArr[newArrCount] = arr[j];
	                newArrCount++;

	            }

	        }
	        System.out.println(Arrays.toString(newArr));



	    }

	public static void addtoIndex(int[] arr, int value, int index) {

		int[] newArr = new int[arr.length + 1];

		int val = 0;

		for (int i = 0; i < newArr.length; i++) {
			if (i == index) {
				newArr[i] = value;
				val = i;
				break;
			} else {
				newArr[i] = arr[i];
			}
		}
		int j = val;
		for (; j < newArr.length - 1; j++) {
			newArr[j + 1] = arr[j];
		}
		System.out.println(Arrays.toString(newArr));
	}

	public static String convertString(int[] arr) {
		// Pseudo
		// 1. get the array
		// 2. Loop through the array and add to a initialized string variable
		// 3. Check if the gvn array is empty and throw null for edge case

		String str = "";
		if (arr.length == 0) {
			return null;
		} else {
			for (int j : arr) {
				str += j;
			}
			return str;
		}
	}

	public static int[] trim(int[] arr, int size) {

		int[] trimArr = new int[size];

		for (int i = 0; i < trimArr.length; i++) {

			trimArr[i] = arr[i];
		}

		return trimArr;
	}
}
