package referenceCode;

import java.io.CharArrayReader;
import java.util.HashMap;

public class SlidingWinNonRepeat {
	public static void main(String[] args) {

		String gvn = "xyzzaz";
		String gvn1 = "aababcabc";

		nrpt(gvn, 3);
		nrpt(gvn1, 3);

	}

	public static void nrpt(String gvn, int k) {

		if (gvn.length() < k || gvn == null) {
			System.out.println("Provide valid input");
		} else {
			StringBuilder gvnstr = new StringBuilder(gvn);
			StringBuilder str = new StringBuilder(gvnstr.substring(0, k));
			int counter = 0;
			counter = chkunique(str, counter);
			for (int i = k; i < gvnstr.length(); i++) {
				System.out.println("ba: "+str.toString());
				str.append(gvnstr.charAt(i));
				System.out.println("Aa: "+str.toString());
				str.replace(0, 1, "");
				System.out.println("Ar: "+str.toString());
				counter = chkunique(str, counter);
				// System.out.println(str);
			}
			System.out.println(counter);
		}

	}

	private static int chkunique(StringBuilder str, int counter) {
		int count = counter;
		HashMap<Character, Integer> cmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			cmap.put(str.charAt(i), cmap.getOrDefault(str.charAt(i), 0) + 1);
		}
		boolean flag = true;
		for (char c : cmap.keySet()) {
			if (cmap.get(c) > 1) {
				flag = false;
				break;
			}
		}
		if (flag)
			count++;
		return count;

	}

}