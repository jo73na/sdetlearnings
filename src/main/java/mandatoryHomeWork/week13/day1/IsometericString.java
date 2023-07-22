package mandatoryHomeWork.week13.day1;

import java.util.HashMap;
import java.util.Map;

public class IsometericString {

	public static void main(String[] args) {
	//	String s = "egg";
	//	String t = "add";
		 String s = "paper", t = "title";
		boolean name = name(s, t);
		System.out.println(name);
	}

	public static boolean name(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			//If the character from "s" at the current index "i" is already mapped to a 
			//different character in "t" (i.e., not equal to the character at the same index "i" in "t"), 
			
			//OR
			
			// If the character from "s" at the current index "i" is not yet present in the "map" but the character from "t" at the same index "i" is already mapped to another character in "s"
			
			//(i.e., the character is already used for another mapping).
			
			if (map.get(s.charAt(i)) != null && map.get(s.charAt(i)) != t.charAt(i)
					|| (map.get(s.charAt(i)) == null && map.containsValue(t.charAt(i)))) {
				return false;
			}
			map.put(s.charAt(i), t.charAt(i));
		}
		return true;
	}

}
