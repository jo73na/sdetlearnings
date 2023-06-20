package mandatoryHomeWork.week9.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] s=	{"def","de","fgh"};
	//	String[] q = {"de","lmn","fgh"};
		String[] s = { "abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn",
				"sdaklfj", "asdjf" };
	String[] q = { "abcde", "sdaklfj", "asdjf", "na", "basdn" };
		List<String> list = Arrays.asList(s);
		List<String> query = Arrays.asList(q);
		List<Integer> matchingStrings = matchingStrings(list,query);
		System.out.println(matchingStrings);

	}

	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
		List<Integer> ansList = new ArrayList<>();
		Map<String, Integer> hm = new HashMap<>();
		int left = 0;
		int right = stringList.size() - 1;
		while (left <= right) {
			if(left==right) {
				hm.put(stringList.get(left), hm.getOrDefault(stringList.get(left), 0) + 1);
				break;
			}
			hm.put(stringList.get(left), hm.getOrDefault(stringList.get(left), 0) + 1);
			left++;
			hm.put(stringList.get(right), hm.getOrDefault(stringList.get(right), 0) + 1);
			right--;
			
		}
		System.out.println(hm);
		for (int i = 0; i < queries.size(); i++) {
			ansList.add(hm.getOrDefault(queries.get(i), 0));

		}

		return ansList;
		// Write your code here

	}

}
