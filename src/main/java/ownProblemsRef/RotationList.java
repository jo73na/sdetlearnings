package ownProblemsRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lis = new ArrayList<>();
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		lis.add(5);
		lis.add(6);
		lis.add(7);
		int k = 2;
		List<Integer> qu = new ArrayList<>();
		qu.add(1);
		qu.add(2);
		List<Integer> circularArrayRotation = circularArrayRotation(lis, k, qu);
		System.out.println(circularArrayRotation);

	}

	public static List<Integer> circularArrayRotation(List<Integer> lis, int k, List<Integer> queries) {
		// Write your code here
		Integer[] array = lis.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(array));
		int len = lis.size() ;
		System.out.println(len);
		if (k > len) {
			k = k % len;
		}

		int a = len - k;
		reverse(array, 0, a-1);
		reverse(array, a, array.length-1);
		reverse(array, 0, array.length-1);

		System.out.println(Arrays.toString(array));

		List<Integer> ans = new ArrayList<>();
		for (int l = 0; l < queries.size(); l++) {
			ans.add(array[queries.get(l)]);
		}

		return ans;
	}

	public static void reverse(Integer[] array, int left, int right) {
		if (array == null || array.length == 1)
			return;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

}
