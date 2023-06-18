package mandatoryHomeWork.week5.day3;

public class IsSubsequenceSearch {

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		boolean charSearch = charSearch(s, t);
		System.out.println(charSearch);

	}

	public static boolean charSearch(String s, String t) {
		if (s.length() > t.length()) {
			return false;
		}
		int sPoint = 0;
		int tPoint = 0;
		while (sPoint < s.length()) {
			char a = s.charAt(sPoint);
			while (tPoint < t.length()) {
				if (t.charAt(tPoint) == a) {
					break;
				}
				tPoint++;
			}
			if (tPoint >= t.length()) {
				return false;
			}

			tPoint++;
			sPoint++;
		}
		return true;
	}

	public boolean isSubsequence(String s, String t) {
		int n = t.length(), m = s.length(), i = 0, j = 0;
		char[] ss = s.toCharArray(), tt = t.toCharArray();

		if (m < 1) {
			return true;
		}

		while (i < n) {
			if (tt[i] == ss[j]) {
				j++;
			}
			i++;
			if (j == m) {
				return true;
			}
		}
		return false;
	}
}
