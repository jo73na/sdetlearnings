package ownProblemsRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeightedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcccdddd";
		List<Integer> queries= new ArrayList<>();
		Integer[] q={1,7,5,4,15};
		queries=Arrays.asList(q);
		weightedUniformStrings(s, queries);
	}

	public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
	
		// Write your code here List<String>
		List<Integer> ans = new ArrayList<>();
		List<String> res = new ArrayList<>();
		char[] arr = s.toCharArray();
		char c = 0;
		if(s.length()<=0)
			return res;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == c) {
				ans.add((arr[i] - 96) + (ans.get(i - 1)));
			} else {
				ans.add(arr[i] - 96);
			}

			c = arr[i];

		}

		System.out.println(ans.toString());

		for (int i = 0; i < queries.size(); i++) {
			if (ans.contains(queries.get(i))) {
				res.add("Yes");

			} else {

				res.add("No");
			}
		}
		System.out.println(res.toString());
		return res;

	}

}
