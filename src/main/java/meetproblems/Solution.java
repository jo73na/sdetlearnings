package meetproblems;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String s = "loveleetcode";
		char c = 'e';
		int[] shortestToChar = shortestToChar(s, c);
		System.out.println(Arrays.toString(shortestToChar));
	}

	public static int[] shortestToChar(String s, char C) {
		int n = s.length();
		int[] outputArr = new int[n];
		int cPosition = -n;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == C) {
				cPosition = i;
			}
			outputArr[i] = i - cPosition;
		}
		System.out.println("forward -> "+Arrays.toString(outputArr));
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == C) {
				cPosition = i;
			}
			outputArr[i] = Math.min(outputArr[i], Math.abs(i - cPosition));
		}
		System.out.println("reverse  -> "+Arrays.toString(outputArr));
		return outputArr;
	}
}
