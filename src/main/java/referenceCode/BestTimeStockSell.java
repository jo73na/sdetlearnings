package referenceCode;

public class BestTimeStockSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void name(int[] arr) {
		int min=Integer.MAX_VALUE;
		int max=0;
		for (int i = 0; i < arr.length; i++) {
		if(arr[i]<min) {
			min=arr[i];
		}else if (arr[i]-min>max) {
			max=arr[i]-min;
		}
			
		}
	}

}
