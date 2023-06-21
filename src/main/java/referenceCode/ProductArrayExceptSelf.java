package referenceCode;

import java.util.Arrays;

public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[]nums = {1,2,3,4};
		 int[] ans = except(nums);
			System.out.println(Arrays.toString(ans));
	}
	public static int[] except(int[] arr) {
		int[] ans=new int[arr.length];
		for(int k=0;k<arr.length-1;k++) {
		int all=1;
		int l=0;
		int r=arr.length-1;
		
		while (l<=r) {
			if(l==k) {
				l++;
			} 
			if(r==k) {
				r--;
			}
		if( l!=r)	{
				all*=arr[l];
				all*=arr[r];
				
			}else  {
				all*=arr[l];
			}
		l++;r--;
		}
		ans[k]=all;
	}
	
		return ans;

}
}
