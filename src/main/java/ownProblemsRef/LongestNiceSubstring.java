package ownProblemsRef;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestNiceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "YazybBbBbBcaAa";
		// {Aa=2, bBbBbB=6}
		String longestNiceSubstring = longestNiceSubstring1(s);
		System.out.println(longestNiceSubstring);
	}

	public static String longestNiceSubstring(String s) {
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> hm = new HashMap<>();
		for (int slow = 0, fast = 1; fast < s.length();) {
			if (Math.abs(s.charAt(slow) - s.charAt(fast)) != 32) {
				// move slow to fast position
				slow = fast;
				// System.out.println(s.charAt(slow));
				// System.out.println(sb.toString());

				sb.setLength(0);
			} else if (Math.abs(s.charAt(slow) - s.charAt(fast)) == 32) {
				// int temp=fast-1;
				// sb.append(s.charAt(slow-1) );

				while (fast < s.length() && Math.abs(s.charAt(fast) - s.charAt(fast - 1)) == 32) {
					sb.append(s.charAt(fast - 1));
					fast++;
				}
				sb.append(s.charAt(fast - 1));
				// return sb.toString();

				hm.put(sb.toString(), sb.length());

			}

			fast++;

		}

		// int key = Collections.max(map.entrySet(),
		// Map.Entry.comparingByValue()).getKey();
		// String map =
		// hm.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
		int max = Collections.max(hm.values());
		String maxKey = hm.entrySet().stream().max(Map.Entry.comparingByValue()) // Optional<Map.Entry<Integer,
																					// Integer>> - entry
				.map(Map.Entry::getKey) // Optional<Integer> - key
				.orElseThrow();
		System.out.println(maxKey);
		for (String st : hm.keySet()) {
			Integer cur = hm.getOrDefault(st, 0);
			if (cur == max) {
				return st;
			}

		}
		return s;

	}

	public static String longestNiceSubstring1(String s) {

		StringBuilder sb = new StringBuilder();
		for (int slow = 0, fast = 1; fast < s.length();) {
			if (Math.abs(s.charAt(slow) - s.charAt(fast)) != 32) {
				sb.append(slow);
				while (fast - (fast - 1) == 32 && s.length() > fast) {
					sb.append(fast);
					fast++;
				}
			} else {
				System.out.println(sb.toString());
				sb.setLength(0);

			}
			fast++;
		}
		return s;

	}

}
