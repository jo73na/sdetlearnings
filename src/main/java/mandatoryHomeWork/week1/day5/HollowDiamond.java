package mandatoryHomeWork.week1.day5;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		printPattern(n);
	}

	static void printPattern(int n) {
		int alpha = 64;
		int i, j, mid;
		if (n % 2 == 1) // when n is odd, increase it by 1 to make it even
			n++;
		mid = n / 2;

		// upper half pattern
		for (i = 1; i <= mid; i++) {
			for (j = 1; j <= mid - i; j++) // print the blank spaces and outer box before star
				System.out.print(" ");

			if (i == 1) {
				System.out.print((char) (alpha + i));
			} else {
				System.out.print((char) (alpha + i)); // in each line star at start and end position
				for (j = 1; j <= 2 * i - 3; j++) { // print space to make hollow
					System.out.print(" ");
				}
				System.out.print((char) (alpha + i));
			}
			for (j = 1; j <= mid - i; j++) // print the blank spaces and outer box after star
				System.out.print(" ");

			System.out.println();
		}

		// lower half pattern
		for (i = mid + 1; i < n; i++) {

			for (j = 1; j <= i - mid; j++) // print the blank spaces and outer box before star
				System.out.print(" ");

			if (i == n - 1) {
				System.out.print((char) (alpha + i));
			} else {
				System.out.print((char) (alpha + i)); // in each line star at start and end position
				for (j = 1; j <= 2 * (n - i) - 3; j++) { // print space to make hollow
					System.out.print(" ");
				}
				System.out.print((char) (alpha + i));
			}
			for (j = 1; j <= i - mid; j++) // print the blank spaces and outer box after star
				System.out.print(" ");

			System.out.println();
		}

	}

}
