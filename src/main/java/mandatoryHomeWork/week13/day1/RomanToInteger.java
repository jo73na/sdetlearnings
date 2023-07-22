package mandatoryHomeWork.week13.day1;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int romanToInt = romanToInt("MCMXCIV");
System.out.println(romanToInt);
	}

	public static int romanToInt(String s) {
		int ans = 0;
		char temp;
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('I',1); 		
		hm.put('V',5); 		
		hm.put('X',10);		
		hm.put('L',50);		
		hm.put('C',100); 		
		hm.put('D',500); 		
		hm.put('M',1000);
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			if (i > 0 && hm.getOrDefault(temp,0) > hm.getOrDefault(s.charAt(i - 1),0)) {
				ans += hm.getOrDefault(s.charAt(i),0) - 2 * hm.getOrDefault(s.charAt(i - 1),0);
			} else {
				ans += hm.getOrDefault(s.charAt(i),0);
			}
		}

		return ans;

	}

}
