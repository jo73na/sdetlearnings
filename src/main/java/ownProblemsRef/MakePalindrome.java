package ownProblemsRef;

import org.springframework.beans.factory.support.ReplaceOverride;

public class MakePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "baabb";
		int pal = pal(s);
	}
	/*
	 * String -> baabb
	 */

	public static int pal(String s) {
		int l = 0;
		int r = s.length() - 1;
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return 2;

			} else {
				l++;
				r--;
			}
		}
		return 1;
	}

}
