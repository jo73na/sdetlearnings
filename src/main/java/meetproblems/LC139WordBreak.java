package meetproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LC139WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "applepenapple";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("apple");
		wordDict.add("pen");
		boolean wordBreak = wordBreak(s, wordDict);
		System.out.println(wordBreak);

		boolean[] f = new boolean[s.length() + 1];
		f[0] = true;
        
        for(int i=1; i <= s.length(); i++){
			for(int j=0; j < i; j++){
				if(f[j] && wordDict.contains(s.substring(j, i))){
					f[i] = true;
					break;
				}
			}
		}

		//System.out.println( f[s.length()];
		
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		int lenCount = 0;
		int lengthOfLineArray=0;
		for (String string : wordDict) {
			if(s.length()>string.length())
			lengthOfLineArray+=string.length();
			
			lenCount += name(s, string);
		}

		if (s.length() == lenCount && lengthOfLineArray<=s.length()) {
		return true;
		}

		return false;

	}

	public static int name(String s, String search) {
int count = 0, fromIndex = 0;
        while ((fromIndex = s.indexOf(search, fromIndex)) != -1 ){
 
           // System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
            
        }

        System.out.println(count * search.length());
		return (count * search.length());
	}

}
