package mandatoryHomeWork.week3.day2;

public class MinimumRecolour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String blocks = "WBBWWBBWBW"; int k = 7;
		int minimumRecolors = minimumRecolors(blocks, k);
		System.out.println(minimumRecolors);
	}
	 public static int minimumRecolors(String s, int k) {
	     	char[] blocks = s.toCharArray();
			 int n=blocks.length;
		        int left=0, right=k-1;
		        int count=0, ans=0;
		        for(int i=left; i<=right; i++){
		            if(blocks[i]=='W') count++;
		        }
		        ans=count;

		        left++; right++;
		        while(right<n){
		            if(blocks[right]=='W' && blocks[left-1]=='B') count++;
		            else if(blocks[right]=='B' && blocks[left-1]=='W') count--;
		            ans=Math.min(ans, count);
		            left++;
		            right++;
		        }

		        return ans;
	    }

}
