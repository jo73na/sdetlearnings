/*package ownProblemsRef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Testtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// create a to b ->array with index
	// whwn that char comes -> add 1 to that index

	public boolean checkInclusion(String s1, String s2) {
		int[] count = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i) - 'a']++;
		}
		int left = 0, right = 0, len = s1.length();
		while (right < s2.length()) {
			if (count[s2.charAt(right++) - 'a']-- >= 1) {
				len--;
			}
			if (len == 0)
				return true;
			if (right - left == s1.length() && count[s2.charAt(left++) - 'a']++ >= 0) {
				len++;
			}
		}
		return false;
	}

	private static void sher(String s){
		   Map<String, Integer> hm = new HashMap<>();
	        int count = 0;
		     for (int i = 0; i < s.length(); i++) {

		            for (int j = i; j < s.length(); j++) {


		                char[] c = s.substring(i, j + 1).toCharArray();

		                Arrays.sort(c);
		                String sNew = new String(c);
		                hm.put((sNew), hm.getOrDefault(sNew, 0) + 1);
		                count+=	hm.containsKey(sNew)?hm.getOrDefault(sNew, 0) + 1:0;

		            }



		        }
	   }

	    

}
*/
