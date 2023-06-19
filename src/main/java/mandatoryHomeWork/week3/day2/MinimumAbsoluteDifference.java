package mandatoryHomeWork.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,8,-10,23,19,-4,-14,27};
		List<List<Integer>> minimumAbsDifference = minimumAbsDifference((arr));
		System.out.println(minimumAbsDifference);
		
	}
	 public static List<List<Integer>> minimumAbsDifference(int[] arr) {
         List<List<Integer>> li = new ArrayList<>();
    Arrays.sort(arr);
    int amd =  Integer.MAX_VALUE;
    for(int i = 0; i < arr.length-1; i++){
        amd  = Math.min(amd,arr[i+1]-arr[i]);
    }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] == amd){
                li.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return li;
    }

}
