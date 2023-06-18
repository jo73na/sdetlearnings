package mandatoryHomeWork.week6.day1;

public class SplitBlancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "RLRRRLLRLL";
		int balancedStringSplit = balancedStringSplit(s);
		System.out.println(balancedStringSplit);
	}
	
	 public static int balancedStringSplit(String s) {
	        int bCount = 0;
			int lCount = 0;
			int rCount = 0;
			for (int i = 0; i < s.length(); i++) {
				
				if (s.charAt(i) == 'R') {
					
					rCount++;
				//	System.out.println(s.charAt(i)+"||"+rCount);

				} else {
					//	System.out.println(s.charAt(i)+"||"+lCount);
					lCount++;
				}

				if (lCount == rCount) {
					//	System.out.println(bCount);
					bCount++;
				}
			}

			return bCount;

	    }

}
