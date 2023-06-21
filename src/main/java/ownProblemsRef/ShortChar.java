package ownProblemsRef;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShortChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		int[] shortestToChar = shortestToChar(s, 'e');
		System.out.println(Arrays.toString(shortestToChar));
	}
	
	 public static int[] shortestToChar(String s, char c) {
		int l=0;
		int r=s.length()-1;
		List<Integer> ls=new ArrayList<>();
		while(l<r) {
			if(s.charAt(l)=='e') {
				ls.add(l);
			}
			if(s.charAt(r)=='e') {
				ls.add(r);
			}
			l++;r--;
		}
		Collections.sort(ls);
		System.out.println(ls);
		return null;
		
	        
	    }
	 
	 public static int[] name(String s, char c) {

			int n = s.length();
	        int[] answer = new int[n];
	        int prev = -n;  // Initialize prev with a value that ensures the first occurrence will be considered as the closest one.

	        // Traverse the string from left to right
	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) == c) {
	                prev = i;
	            }
	            answer[i] = i - prev;
	        }

	        // Traverse the string from right to left
	        prev = 2 * n;  // Initialize prev with a value that ensures the last occurrence will be considered as the closest one.
	        for (int i = n - 1; i >= 0; i--) {
	            if (s.charAt(i) == c) {
	                prev = i;
	            }
	            answer[i] = Math.min(answer[i], prev - i);
	        }

	        return answer;
			 
	}

}
