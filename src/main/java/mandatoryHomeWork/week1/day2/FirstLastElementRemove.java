package mandatoryHomeWork.week1.day2;

import java.util.Arrays;

public class FirstLastElementRemove {

	public static void main(String[] args) {
		int[] input = {1,2,1,4,1,8};
				int number = 1;
				int[] posFind = PosFind(input, number);
				System.out.println(Arrays.toString(posFind));
	}
	
	static int[] createArray(int[] PosFind, int[] input) {
	
		if(PosFind[0]!=-1 && PosFind[1]!=-1) {
			int[] newArrayTwo= new int[input.length-2];
			for (int i = 0; i < newArrayTwo.length; i++) {
				if(i!=PosFind[0] || i!=PosFind[i]) {
					newArrayTwo[i]=input[i];
				}
				
			}
		}
		
		
		
		return PosFind;
		
	}

	static int[] PosFind(int[] arr, int target) {
		int start = 0;
		int last = arr.length - 1;
		boolean firstFlag = false;
		boolean lastFlag = false;
		int[] pos = { -1, -1 };
		while (start < last) {
			if (arr[start] == target && firstFlag==false) {
				pos[0] = start;
				firstFlag = true;

			} else {
				start++;
			}
			if (arr[last] == target && lastFlag==false) {
				pos[1] = last;
				lastFlag = true;
			} else {
				last--;
			}
			


		}
return pos;
	}

}
