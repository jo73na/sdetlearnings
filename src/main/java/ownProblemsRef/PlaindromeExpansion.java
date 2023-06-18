package ownProblemsRef;

import java.util.Iterator;

public class PlaindromeExpansion {

	public static void main(String[] args) {
		String s = "abba";
		boolean pali = pali(s);
		System.out.println(pali);

	}

	public static boolean pali(String st) {
		char[] arr = st.toCharArray();
		int	s = (st.length() % 2 != 0) ? st.length() / 2 : st.length() / 2 - 1;
		int e = st.length() / 2;

		for (; s >= 0 && e < arr.length; s--, e++) {
			if (arr[s] != arr[e]) {
				return false;
			}
		}
		return true;

	}

}
