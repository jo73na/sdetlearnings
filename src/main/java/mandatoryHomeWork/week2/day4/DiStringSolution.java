package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

public class DiStringSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] diStringMatch = diStringMatch("IDID");
		System.out.println(Arrays.toString(diStringMatch));
	}
	public static int[] diStringMatch(String s) {
        int n = s.length();
		int[] newStringArr = new int[n + 1];

		int start = 0;
		int end = n;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I') {
				newStringArr[i] = start++;
			} else {
				newStringArr[i] = end--;
			}
		}
		newStringArr[n] = start;

		return newStringArr;
	}

}
