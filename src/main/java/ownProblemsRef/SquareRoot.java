package ownProblemsRef;

public class SquareRoot {

	public static void main(String[] args) {

		System.out.println(check(40, 2));

	}

	public static double check(int n, int p) {
	

		int start = 0;
		int end = n;
		double root = 0.0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid * mid == n) { 
		
				return mid;
			}
			if (mid * mid > n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			root = start;
			System.out.println(root);
		}

		double inc = 0.1;
		for (int i = 0; i < p; i++) {
			while (root * root <= n) {
				root += inc;
			//	System.out.println();
			}
			root -= inc;//3.2=0.1=3.1
			inc /= 10;//=>0.01

		}

		return (root);

	}

}
