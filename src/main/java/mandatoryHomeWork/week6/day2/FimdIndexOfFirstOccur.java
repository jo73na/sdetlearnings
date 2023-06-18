package mandatoryHomeWork.week6.day2;

public class FimdIndexOfFirstOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String	haystack = "sadbutsad"; String needle = "sad";
	int strStr = strStr(haystack, needle);
	System.out.println(strStr);
	}
	 public static int strStr(String hChk, String nGiven) {

			int count = 0;
				int i = 0;
				int pos = 0;
				if(hChk.length()<nGiven.length()){
					return -1;
				}
				for (int k = 0; k < hChk.length(); k++) {
					pos = k;
					if (nGiven.charAt(i) == hChk.charAt(k)) {
						int j=k;
						for (; i < nGiven.length();) {
							if (nGiven.charAt(i++) == hChk.charAt(j++)) {
								count++;
							}else {
								count=0;
								i=0;
								break;
							}
						
						}
						if (count == nGiven.length()) {
							return pos;
						}
					}

				}
				return -1;


		    }

}
