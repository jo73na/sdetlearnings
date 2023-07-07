package meetproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC438_FindAllAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String	s = "cbaebabacd", p = "abc";
	name(s, p);
	}

	public static List<Integer> name(String s, String p) {
		        // Result list
		        List<Integer> result                        = new ArrayList<>();
		        // Hash map of occurrences of each character of p string
		        Map<Character, Integer> ph      = new HashMap<>();
		        // Hash map of occurrences of each character of the considered window
		        Map<Character, Integer> sh = new HashMap<>();
		        // Starting and ending pointer of the window
		        int left = 0;

		        // Build the table of occurrences of string p
		        for (int i = 0; i < p.length(); i++) {
		            char c = p.charAt(i);
		            ph.put(c, ph.getOrDefault(c, 0) + 1);
		        }

		        // Iterate over the characters
		        for (int right=0;right < s.length();) {
		            // Count the occurrences of the selected character
		            char rightChar = s.charAt(right);
		            sh.put(rightChar, sh.getOrDefault(rightChar, 0) + 1);

		            // Increment the right bound of the window
		           right++;

		            // When the window reach the dimension of p
		            if (right >= p.length()) {
		                // If the map are equals, the string in the window is an anagram of p
		                if (sh.equals(ph)) {
		                    result.add(left);
		                }
		                // Then, remove the first character of the window and add a new character,
		                // in order to move the window
		                char lChar = s.charAt(left);
		                if (sh.containsKey(lChar)) {
		                    // Remove one occurrence of the left character
		                    sh.put(lChar, sh.get(lChar) - 1);
		                    // If there are not any occurrences of the left character, remove it
		                    if (sh.get(lChar) == 0) {
		                        sh.remove(lChar);
		                    }
		                    
		                    
		                    // Increment the left bound of the window
		                    left++;
		                }
		            }
		        }
System.out.println(result);
		        return result;

	}

	

}
