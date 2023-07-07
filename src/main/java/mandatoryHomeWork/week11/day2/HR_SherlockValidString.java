package mandatoryHomeWork.week11.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HR_SherlockValidString {

	public static void main(String[] args) {

	}
	
	 public static String isValid(String s) {
		    // Write your code here
		             // Write your code here
		        Map<Character, Integer> charCount = new HashMap<>();
		        for (int i = 0; i < s.length(); i++) {
		            Character c = s.charAt(i);
		            
		            charCount.put(c, charCount.getOrDefault(c,0) + 1);
		            
					/*
					 * if (charCount.containsKey(s.charAt(i))) { charCount.put(c, charCount.get(c) +
					 * 1); } else { charCount.put(c, 1); }
					 */

		        }

		        Set<Character> keys = charCount.keySet();
		        Integer[] arr = new Integer[charCount.size()];
		        int k = 0;
		        for (Character c: keys) {
		            arr[k++] = charCount.get(c);
		        }
		        if(arr.length==1) return "YES";
		        Arrays.sort(arr);
		        
		        int f=arr[0];
		        int sc=arr[1];
		        int ls=arr[arr.length-2];
		        int l=arr[arr.length-1];
		        if (f == l) {
		        //    System.out.println("f=l");
		            return "YES";
		        }


		        if (f == 1 && sc == l) {
		        //    System.out.println("(f == 1 && sc == l");
		            return "YES";
		        }
		            
		        if (f == sc && sc == ls && ls == l - 1) {
		        //    System.out.println("f == sc && sc == ls && ls == l - 1)");
		            return "YES";
		        }
		            

		        return "NO";
		    

		    }

}
