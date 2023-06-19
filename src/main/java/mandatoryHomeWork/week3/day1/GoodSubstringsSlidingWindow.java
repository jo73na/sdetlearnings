package mandatoryHomeWork.week3.day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GoodSubstringsSlidingWindow {

	public static void main(String[] args) {
		int goodString = goodString("aababcabc");
		System.out.println(goodString);
		System.out.println("====================");
		int goodString1 = goodStringWithoutK("bbbb");
		System.out.println(goodString1);
	}

	public static int goodString(String s) {
		int k = 3;
		int count = 0;
		int len = s.length();
		for (int i = 0; i <= len - k; i++) {
			System.out.println("i : " + i + "| len-k: " + (len - k) + " :");
			if (isGoodString(s.charAt(i + 0), s.charAt(i + 1), s.charAt(i + 2))) {
				System.out.print(s.charAt(i + 0));
				System.out.print(s.charAt(i + 1));
				System.out.print(s.charAt(i + 2));
				System.out.println();
				count++;
			}
		}
		return count;
	}

	private static boolean isGoodString(char charAt, char charAt2, char charAt3) {
		if (charAt != charAt2 && charAt != charAt3 && charAt2 != charAt3) {
			return true;
		}
		return false;
	}

	public static int goodStringWithoutK(String s) {
		int fast=0;
		int slow=0;
		int count = 0;
		int maxCount=0;
		int len = s.length();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		while(fast<len) {
			if(hm.get(s.charAt(fast))==null) {
				hm.put(s.charAt(fast), fast);
				count=fast-slow+1;
				fast++;
				maxCount=(maxCount<count)?count:maxCount;
			}else if(hm.get(s.charAt(fast))!=null){
				hm.remove(s.charAt(slow));
				slow++;
				
			}
		}
		
		return maxCount;
	}
	
}
