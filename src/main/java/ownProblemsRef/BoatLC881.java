package ownProblemsRef;

import java.util.Arrays;

public class BoatLC881 {

	public static void main(String[] args) {
		int[] people = { 1, 2, 2, 3 };
		int limit = 3;
		int[] people1 = {};
		int name = count(people, limit);
		System.out.println(name);
	}

	public static int name(int[] ppl, int lmt) {
		Arrays.sort(ppl);
		int s = 0;
		int e = ppl.length - 1;
		int count = 0;
		while (e >= s) {
			if (ppl[s] + ppl[e] <= lmt) {
				s++;
				e--;
			} else {
				e--;
			}
			count++;
		}
		return count;
	}

	public static int count(int[] people, int limit) {
		int[] boat = new int[limit + 1];
		for (int p : people)
			boat[p]++;
		int start = 0;
		int end = boat.length - 1;
		int solution = 0;
		while (start <= end) {
			while (start <= end && boat[start] <= 0)
				start++;
			while (start <= end && boat[end] <= 0)
				end--;
			if (boat[start] <= 0 && boat[end] <= 0)
				break;
			solution++;
			if (start + end <= limit)
				boat[start]--;
			boat[end]--;
		}
		return solution;
	}

}
