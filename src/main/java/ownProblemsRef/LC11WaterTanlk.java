package ownProblemsRef;

public class LC11WaterTanlk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int levelMax(int[] lv) {
		int left=0;
		int rignt=lv.length-1;
		int minVal=Integer.MAX_VALUE;
		int maxVal=0;
		while (left<rignt) {
			 minVal= Math.min(lv[left],lv[rignt])*(rignt-left);
			if(lv[left]<=lv[rignt]) {
				left++;
			}else if(lv[left]>lv[rignt]) {
				rignt--;
			}
			 maxVal= Math.max(maxVal,minVal);
		}
		return maxVal;
		
	}

}
