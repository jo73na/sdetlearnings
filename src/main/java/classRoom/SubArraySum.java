package classRoom;

public class SubArraySum {

	public static void main(String[] args) {
		int arr[] = {1, 1, 44, 1, 1, 1};
		int count = count(arr, 3);
		System.out.println(count);

	}

	public static int count(int[] arr, int k) {
		int count = 0;
		int sum = 0;

		// Traverse the array from start to end.
				for (int i = 0, j=0; i<arr.length ; i++) {
					
					if(sum<k) {
						sum+=arr[i];
						System.out.println("Sum<k : "+sum);
						continue;
					}
					if(sum>k) {
						sum-=arr[j]+arr[i];
						j++;
						System.out.println("Sum>k  : "+sum +" j :  "+ j);
						
					}
					if (sum==k) {
						count++;
						System.out.println("Sum==k : "+sum +"count :  "+ count);
						break;
					}
					
				
				}

				return count;


	}

}
