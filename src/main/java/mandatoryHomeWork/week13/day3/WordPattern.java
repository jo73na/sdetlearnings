package mandatoryHomeWork.week13.day3;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba", s = "dog cat cat dog";
		String pattern1 = "aaaa", s1 = "dog cat cat dog";
		boolean wordPattern = wordPattern(pattern1, s1);
		boolean wordPattern2 = wordPattern(pattern, s);
		System.out.println(wordPattern+","+wordPattern2);
	}

	public static boolean wordPattern(String pattern, String s) {
		HashMap<Character, String> mp = new HashMap<>();
		char[] alpha = pattern.toCharArray();
		String[] words = s.split("\\s+");
		if (words.length != pattern.length())
			return false;
		int i = 0;
		for (char ch : alpha) {
			if (mp.containsKey(ch)) {
				if (!mp.get(ch).equals(words[i++]))
					return false;
			} else {
				if (mp.containsValue(words[i]))
					return false;
				mp.put(ch, words[i++]);
			}

		}
		return true;
	}

}
