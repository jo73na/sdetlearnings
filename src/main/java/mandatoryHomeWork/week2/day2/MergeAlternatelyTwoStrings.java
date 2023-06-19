package mandatoryHomeWork.week2.day2;

public class MergeAlternatelyTwoStrings {
	
	//convert to words to char array
	//find the length of two arrays 
	//initialize two pointers left and right =0
	//check the two pointers are less thean the sizes of the arrays so that elements are there to add or esle we can stop the loop
	//check if the first array has element left to add -> if no elements left it simply skip
			//add the element to string buileder 
	//check if the 2nd array has element left to add 
			//add the element to string buileder
	
	
	

	public static void main(String[] args) {
		String word1 = "ab"; String word2 = "pqrs";
		String mergeAlternately = mergeAlternately1(word1, word2);
		System.out.println(mergeAlternately);
	}

	public static String mergeAlternately(String s1, String s2) {
		int left = 0;
		int right = 0;
		char[] fArray = s1.toCharArray();
		char[] sArray = s2.toCharArray();
		int fLen = fArray.length - 1;
		int slen = sArray.length - 1;
		StringBuilder sb = new StringBuilder();
		while (left <= fLen || right <= slen) {//false ||true
			if (left <= fLen) {//false
				sb.append(fArray[left++]);
			}
			if (right <= slen) {
				sb.append(sArray[right++]);
			}
		}
		return sb.toString();

	}
	
	public static String mergeAlternately1(String s1, String s2) {
		
		StringBuilder sb = new StringBuilder();
		int fLen = s1.length();
		int slen = s2.length();
		for (int i=0; i<s1.length() ||i<s2.length(); i++) {
			if (i <fLen ) {
				sb.append(s1.charAt(i));
			}
			if (i < slen) {
				sb.append(s2.charAt(i));
			}
		}
		return sb.toString();

	}
	
	public static String nameCalvin(String word1, String word2) {
		int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder s1 = new StringBuilder();
        int i = 0, j = 0;
        for(int k = 0; k < len1+len2; k++) { 
            if(i < len1) {
                s1.append(word1.charAt(k));
                i++;
            }
            if(j < len2) {
                s1.append(word2.charAt(k));
                j++;
            }
        }
        return s1.toString();
	}
	

}
