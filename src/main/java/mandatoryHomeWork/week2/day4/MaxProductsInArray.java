package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

public class MaxProductsInArray {
	
//	set largest to the first value in the array
//	set secondLargest to the smallest possible
//	now iterate thru the array.
//	if the current value is greater than largest:
//	replace secondLargest with Largest
//	replace largest with current value
//	else check to see if current value is greater than secondLargest and assign if true.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 3, 2, 5, 3};
		 int[] arr1={3,4,5,2};
		 int[] arr2= {};
		 int[] arr3= {1,0};
		 
		    int result = maxProduct(arr1);
		    int result1 = MaxSortProd(arr1);
		    
		    
		    System.out.println("unsorted : "+result);
		    System.out.println("Sorted : "+result1);
	}
	
	public static int MaxSortProd(int[] arr) {
		
		Arrays.sort(arr);
		int lastPos=arr.length-1;
		int lastBefPos=arr.length-2;
		
		int prodMax=(arr[lastPos]-1)*(arr[lastBefPos]-1);
		return prodMax;
	}
	
	public static int maxProduct(int arr[]) {
		if(arr.length<=0) {
			return -1;
		}
	    int largest = arr[0];
	    int largestProd=0;
	    int secondLargest = Integer.MIN_VALUE;
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > largest) {
	            secondLargest = largest;
	            largest = arr[i];
	        } else if (arr[i] > secondLargest) {
	            secondLargest = arr[i];
	        }
	    }
	    largestProd=(largest-1)*(secondLargest-1);
	    return largestProd;
	}

}
