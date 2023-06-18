package ownProblemsRef;

public class SubUniqueString {

	public static void main(String[] args) {
		String s = "st";
		String s1 = "xyzzaz";
		int nums = Slide(s1, 3);
		System.out.println("unique: :" + nums);

	}

	public static int Slide(String s, int k) {

		int count = 0;
		int len = s.length();
		if (len < k) {
			System.out.println("String length is less than unique window size");
			return -1;
		}
		for (int i = 0; i <= len - k; i++) {
			System.out.println("i : " + i + "| len(" + len + ")-k(" + k + "): " + (len - k) + " :");
			System.out.println((s.charAt(i + 0) + "|" + s.charAt(i + 1) + "|" + s.charAt(i + 2)));
			if (isGood(s.charAt(i + 0), s.charAt(i + 1), s.charAt(i + 2))) {
				// System.out.println(( s.charAt(i+ 0)+"|"+s.charAt(i+ 1)+"|"+s.charAt(i+ 2)));
				count++;
				System.out.println("count : " + count);
			}
		}

		return count;
	}

	static boolean isGood(char a, char b, char c) {
		if (a == b || a == c || b == c) {
			return false;
		}
		return true;
	}

}
