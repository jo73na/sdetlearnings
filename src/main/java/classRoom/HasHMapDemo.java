package classRoom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HasHMapDemo {
	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise. An Anagram is a word or phrase formed by rearranging the letters
	 * of a different word or phrase, typically using all the original letters
	 * exactly once. Constrains: s and t consist of lowercase English letters.
	 * Input: s = "anagram", t = "nagaram" Output: true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram", t = "nagaram";
		boolean areAnagram = areAnagram(s, t);
		System.out.println(areAnagram);
		int arr[] = {1, 5, 3, 4, 3, 5, 6 };
		int ask = ask(arr);
		System.out.println(ask);
	}

	/**
	 * @param str1
	 * @param str2
	 * @return
	 */
	static boolean areAnagram(String str1, String str2) {
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		if (str1.length() == str2.length())
			for (int i = 0; i < arr1.length; i++) {
				hm1.put(arr1[i], hm1.getOrDefault(arr1[i], 0) + 1);
				hm2.put(arr2[i], hm2.getOrDefault(arr2[i], 0) + 1);
			}
		return (hm1.equals(hm2) ? true : false);
	}

	static int ask(int[] str1) {
		Map<Integer, Integer> hm1 = new LinkedHashMap();
	int	miniPos=Integer.MAX_VALUE;
		for (int i = 0; i < str1.length; i++) {
			if (hm1.get(str1[i]) == null) {
				hm1.put(str1[i], i + 1);
			} else {
				miniPos=(miniPos<i+1)?miniPos:i+1;
			}

		}
		System.out.println(hm1);
		return miniPos;

	}

}
