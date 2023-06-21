package referenceCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr={1,2,3,4,7,6,7,8};
		 boolean dup = dup(arr);
		 System.out.println(dup);
	}
	public static boolean dup(int[] arr) {
		if(arr.length<=1)
			return false;
		int l=0;
		int r=arr.length-1;
		Map<Integer,Integer> hm= new HashMap<>();
		boolean flag=false;
		while (l<r) {
			hm.put(arr[l],hm.getOrDefault(arr[l], 0)+1);
			hm.put(arr[r],hm.getOrDefault(arr[r], 0)+1);
			flag=(hm.getOrDefault(arr[l],0)<2)?false:true;
			flag=(hm.getOrDefault(arr[r],0)<2)?false:true;
			if(flag) {
				return flag;
			}
			
			l++;r--;
		}
		return flag;
		
	}

}
