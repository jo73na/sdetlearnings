package mandatoryHomeWork.week3.day5;

import java.util.Iterator;
import java.util.TreeMap;

public class ShuffledWords {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		String arrange = arrange(s);
		System.out.println(arrange);
	}

	public static String arrange(String s) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		StringBuilder sb = new StringBuilder();
		String[] split = s.split(" ");
		int length = split.length;
		for (String st : split) {
			tm.put((int) (st.charAt(st.length() - 1)), st.replace(st.charAt(st.length() - 1), ' '));
		}
		for (Integer key : tm.keySet()) {
			sb.append(tm.get(key));
		}

		return sb.toString().trim();

	}

}
