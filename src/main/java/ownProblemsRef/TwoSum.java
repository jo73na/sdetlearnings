package ownProblemsRef;

import java.util.Arrays;
import java.util.StringJoiner;

public class TwoSum {
	public static void main(String[] args) {
		String mergeAlternately =(mergeAlternately("abc", "pqrst"));
		System.out.println(mergeAlternately);
	}

	public static String mergeAlternately(String word1, String word2) {
		int l = 0, r = 0;
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		int n = word1Array.length;
		int m = word2Array.length;
	//	char[] newWord = new char[m + n];
		StringBuilder newWrd = new StringBuilder();
		int index = 0;

		while (l < n || r < m) {
			if (l < n) {
			//	newWord[index++] = word1Array[l++];
				newWrd.append(word1Array[l++]);
			} 
			if (r < m) {
				//newWord[index++] = word2Array[r++];
				newWrd.append(word2Array[r++]);
			}
		}
//		return Arrays.toString(newWord);
		return (newWrd.toString());

	}
}
