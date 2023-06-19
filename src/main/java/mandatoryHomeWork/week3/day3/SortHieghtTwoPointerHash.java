package mandatoryHomeWork.week3.day3;

import java.util.Arrays;
import java.util.HashMap;

public class SortHieghtTwoPointerHash {

	public static void main(String[] args) {
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		name(names, heights);

	}
	public static void name(String[] names, int[] heights) {
	
		
		int nLen=names.length-1;
		int hLen=heights.length-1;
		HashMap<Integer, String> map = new HashMap<>();
		for (int i = 0; i < heights.length; i++) {
			map.put(heights[i], names[i]);
		}
		 String[] res = new String[names.length];
		 int right=names.length-1;
		  Arrays.sort(heights); // sorted in ascending order
	        for (int i = 0; i < names.length; i++) {
	            res[res.length - 1 - i] = map.get(heights[i]);
	        }
	        
		
		System.out.println(Arrays.toString(res));
	}

}
