package mandatoryHomeWork.week9.day3;

import java.util.Arrays;
import java.util.List;

public class GameOftwoStacks {

	public static void main(String[] args) {
		Integer[] s = { 4, 2, 4, 6, 1 };
		Integer[] q = { 2, 1, 8, 5 };

		List<Integer> a = Arrays.asList(s);
		List<Integer> b = Arrays.asList(q);
		int max = 10;
		int count = twoStacks1(max, a, b);
		System.out.println(count);
	}

	public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
		int count = 0;
		int left = 0;
		int right = 0;
		int totalSum = 0;
		while (totalSum <= maxSum) {
			if (left < a.size()) {
				count++;
				Integer l = a.get(left);
				totalSum += (l);
				left++;
			}
			if (right < a.size()) {
				count++;
				Integer r = a.get(right);
				totalSum += (r);
				right++;
			}

		}
		return count;
	}

	static int twoStacks1(int maxSum, List<Integer> a, List<Integer> b) {

		int result = 0;
		int sum = 0;
		int aCount = 0;
		int bCount = 0;

		for (Integer i : a) {
			if (sum + i > maxSum) {
				break;
			}
			sum += i;
			aCount++;
		}
		for (Integer i : b) {
			sum += i;
			bCount++;
			while (sum > maxSum && aCount > 0) {
				sum -= a.get(aCount);
				aCount--;
			}
			result = (sum <= maxSum) ? Math.max(aCount+bCount,result) : maxSum;
		}
		return result;
	}

}
