package mandatoryHomeWork.week9.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SherlocAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ifailuhkqq";
		int sherlockAndAnagrams = sherlockAndAnagrams(s);
		System.out.println(sherlockAndAnagrams);
	}

	public static int sherlockAndAnagrams(String s) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sNew = s.substring(i, j + 1).chars().sorted()
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
				hm.put((sNew), hm.getOrDefault(sNew, 0) + 1);

			}

		}
		System.out.println(hm);
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		if (set.size() > 1) {
			for (String key : hm.keySet()) {
				if (hm.get(key) > 1) {
					count++;
				}
			}
		} else {
			for (Integer val : hm.values()) {

				count += val;

			}

		}
		System.out.println(count);
		return count;

	}

}
