package mandatoryHomeWork.week1.day4;

public class MissingNum {
	 //get n from length of array
	// Method to calculate sum of 'n' numbers 
	// Method to calculate sum of all elements of array
	// missing num =stp1-stp2

	public static void main(String[] args) {

		//int[] a = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int[] a1 = { 1,0 };
		int[] a = {  };
		// Step 1
		int n = a.length;
		if(n>0&&a!=null) {
		// Step 2
		int sumOfNnumbers = sumOfNnumbers(n);
		// Step 3
		int sumOfElements = sumOfElements(a);
		// Step 4
		int missingNumber = sumOfNnumbers - sumOfElements;
		System.out.println("Missing Number is = " + missingNumber);
		}else {
			System.out.println("Missing array");
		}
	}

	static int sumOfNnumbers(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	static int sumOfElements(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}
