package classRoom;

import java.util.Arrays;

public class BubbleSortAlgorithim {

	public static void main(String[] args) {
		int[] arr = { 11, 4, 17, 18, 2, 22, 18 };	
		System.out.println(Arrays.toString(arr));
		System.out.println("<-------------After-Sorting------------->");
		
		algorith(arr);
	

	}
	
	public static void algorith(int[] arr) {
		//length of the array 
		int n = arr.length-1;
		//check whether its is Swapped or not 
		boolean isSwapped;
		
		//iterate the entire loop for every element
		for (int i = 0; i <= n; i++) {
			//for every iteration set the flag to false
			isSwapped = false;
			//iterate tilll the element before the max element -> n-i-> for every iteration last element is set to max
			for (int j = 1; j <= n - i; j++) {
				//swap function if cureent ele and next pos element is small
				//chage flag to true
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					isSwapped = true;
				}
			}
			
			//break the loop if swap is false-> other values are in order
			if (!isSwapped) {
				System.out.println("swapped= " + isSwapped);
				System.out.println(Arrays.toString(arr));
				System.out.println("<--------------break -------------->");
				break;
			}
		}
		
	}

}
