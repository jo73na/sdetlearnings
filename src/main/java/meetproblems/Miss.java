package meetproblems;

import java.util.Arrays;

public class Miss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = {1, 4, 7, 2, 3};
int missingNum = missingNum(age);
System.out.println(missingNum);
	}

	public static int missingNum(int[] arr) {

		int len = arr.length;
		Arrays.sort(arr);

		for (int i = 0; i < len; i++) {
			if (i + 1 == arr[i]) {
				continue;
			} else {
				return i + 1;
			}
		}

		return -1;
	}

}
