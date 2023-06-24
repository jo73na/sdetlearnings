package meetproblems;

public class FortCapture {

	public static void main(String[] args) {
		int[] forts= {1,0,0,-1,0,0,0,0,1};
		final int len = forts.length;
	    int ans = 0;
	    for (int slow = 0, fast = 0; slow < len; slow++) {
	      if (forts[slow] != 0) {
	        if (forts[slow] == -forts[fast]) {
	        	int res=slow - fast - 1;
	          ans = (ans>res)?ans:res;
	        }
	        fast = slow;
	      }
	    }

	    System.out.println( ans);
	}
	
	

}
