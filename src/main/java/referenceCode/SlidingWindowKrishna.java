package referenceCode;

public class SlidingWindowKrishna {

	public static void main(String[] args) {
int s=str("","");
	}

	private static int str(String haystack, String needle) {
		 int left=0, right=0; 
			int index=0, count=0;
			StringBuffer bf =  new StringBuffer();
			if(haystack.length() < needle.length()) {
				return -1;
			}
			for(right = 0; right < needle.length(); right++) {
					bf.append(haystack.charAt(right));
			}
			if(bf.toString().equals(needle)) {	
				index = 0;
	                count++;
	                return index;
			}
			while(right < haystack.length()) {
				if(right-left+1 > needle.length()) {
					bf.deleteCharAt(0);
					left++;
					bf.append(haystack.charAt(right));
					if(bf.toString().equals(needle)) {
						index = left;
						count++;
	          return index;
					}
				}
				right++;
			}
			if(count <= 0) {
				return -1;
			}
			return index;

	}
	
	

}
