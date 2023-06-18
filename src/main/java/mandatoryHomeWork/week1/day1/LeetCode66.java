package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

public class LeetCode66 {

	public static void main(String[] args) {
		int[] digits = {4,3,2,1};
		int[] plusOne = plusOne(digits);
		System.out.println(Arrays.toString(plusOne));
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

}
