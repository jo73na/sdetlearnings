package meetproblems;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public static void main(String[] args) {
		String	s = "anagram",  t = "ntgaram";
		boolean anagram = isAnagram(s, t);
System.out.println(anagram);
	}
	
	 public static boolean isAnagram(String s, String t) {
		 if(s.length()==t.length()) {
			   Map<Character, Integer> th      = new HashMap<>();
		        Map<Character, Integer> sh = new HashMap<>();
			 for (int i = 0; i < s.length(); i++) {
				  th.put(t.charAt(i), th.getOrDefault(t.charAt(i), 0) + 1);
				  sh.put(s.charAt(i), sh.getOrDefault(s.charAt(i), 0) + 1);
				}
			
			 System.out.println(sh);
			 System.out.println(th);
			 return sh.equals(th);
		 }
		
		 
		 
		 return false;
	        
	    }

}
