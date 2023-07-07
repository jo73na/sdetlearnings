package meetproblems;

import java.util.HashMap;
import java.util.Iterator;

public class LC438_FindAllAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void name(String s, String p) {
		HashMap<Character, Integer> ph = new HashMap<>();
		HashMap<Character, Integer> sh = new HashMap<>();
		for (int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);
			ph.put(c, ph.getOrDefault(c, 0) + 1);
		}
		int count=0;
		int left=0;
		for (int right = 0; right < s.length(); right++) {
			char c = p.charAt(right);
			sh.put(c, sh.getOrDefault(c, 0) + 1);
			if(right>=3) {
				
			}
			
			
			
			
			
		}

	}

}
