package ownProblemsRef;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SherLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefghhgfedecba";
		String s1 = "aabbcd";
		String s2 = "aabbccddeefghi";
		String valid = isValid(s1);
		System.out.println(valid);

	}

	public static String isValid(String s) {
		// Write your code here
		Map<Character, Integer> charCount = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (charCount.containsKey(s.charAt(i))) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}

		}

		Set<Character> keys = charCount.keySet();
		Integer[] arr = new Integer[charCount.size()];
		int k = 0;
		for (Character c : keys) {
			arr[k++] = charCount.get(c);
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int f = arr[0];
	//	System.out.println("f : "+f);
		int sc = arr[1];
	//	System.out.println("sc : "+sc);
		int ls = arr[arr.length - 2];
	//	System.out.println("ls : "+ls);
		int l = arr[arr.length - 1];
	//	System.out.println("l : "+l);
		if (f == l) {
		//	System.out.println("f=l");
			return "YES";
		}


		if (f == 1 && sc == l) {
		//	System.out.println("(f == 1 && sc == l");
			return "YES";
		}
			
		if (f == sc && sc == ls && ls == l - 1) {
		//	System.out.println("f == sc && sc == ls && ls == l - 1)");
			return "YES";
		}
			

		return "NO";
	}

}
