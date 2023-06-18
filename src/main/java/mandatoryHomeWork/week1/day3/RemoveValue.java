package mandatoryHomeWork.week1.day3;

import java.util.Arrays;

public class RemoveValue {

	public static void main(String[] args) {

		int[] digits = { 1, 2, 3, 9, 9, 6, 8 };
		int target = 9;
		 val(digits, target);
		
		
	}

	static void val(int[] arr, int target) {
		System.out.println("Bdel :" + Arrays.toString(arr));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
				// shifting elements
				for (int k = i; k < arr.length - 1; k++) {
					arr[k] = arr[k + 1];
				}
				i--;				// break;
			}
		}
		System.out.print("After Deletion :" );
		int[] arrNew=new int[ arr.length-count];
        for(int i = 0; i < arr.length-count; i++){
        	
            arrNew[i]= arr[i];
        }
        System.out.println("Whole New array :" + Arrays.toString(arrNew));

	}
}