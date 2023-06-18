package ownProblemsRef;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		String st="jotheesh";
		String revese = revese(st);
System.out.println(revese);
	}
	
	public static String revese(String st) {
		char[] arr = st.toCharArray();
	int	s=0;
	int	e=arr.length-1;
	if(arr.length<=1) {
		return st;
	}
		while (s<e) {
					
			swap(arr,s,e);
			s++;
			e--;
			
		}
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
		
	}

	private static void swap(char[] arr, int s, int e) {
char t=arr[s];
arr[s]=arr[e];
arr[e]=t;
		
	}

}
