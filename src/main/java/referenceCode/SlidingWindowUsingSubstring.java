package referenceCode;

public class SlidingWindowUsingSubstring {

	public static void main(String[] args) {
		int strStr = strStr("", "");
	}

	private static int strStr(String haystack, String needle) {
		// TODO Auto-generated method stub
		 for ( int i = 0,j=needle.length(); j <= haystack.length(); i++,j++) {
	            
				if(haystack.substring(i, j).equals(needle)) {
					return i;
				}
		    	
			}
		return -1;	
	}
	
	
	
}



