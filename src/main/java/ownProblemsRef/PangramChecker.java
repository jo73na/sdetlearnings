package ownProblemsRef;

import java.util.Arrays;

public class PangramChecker {
	public static boolean isPangram(String str) {
		boolean[] present = new boolean[26];
		Arrays.fill(present, false);
		
		str = str.toLowerCase().replaceAll("\\s","");

		int left = 0; // Left pointer
		int right = 0; // Right pointer

		while (right < str.length()) {
			
			if (str.charAt(right) >= 'a' && str.charAt(right) <= 'z') {
			System.out.print("c : "+str.charAt(right) +"-"+ 'a'+"=");		System.out.println(+(str.charAt(right) - 'a'));
				int index = (str.charAt(right) - 'a');
				
				present[index] = false;
				while (!present[index]) {
				System.out.print(index+" : "+str.charAt(left) +"-"+ 'a'+"=");				System.out.println(+(str.charAt(left) - 'a'));
					present[index]=true;
					
				}

				
			}
			

			right++;
		}
		boolean flag = true;
		int i=0;
		for (boolean b : present) {
			System.out.println((i++)+"|"+flag);
		if (b!=true) {
			flag=false;
			return flag;
		}
		}
		return flag;
	}

	public static void main(String[] args) {
		String sentence = "We promptl udged antique ivor buckles for the next prize";
		boolean isPangram = isPangram(sentence);

		if (isPangram) {
			System.out.println("not pangram.");
		} else {
			System.out.println(" pangram.");
		}
	}
}
