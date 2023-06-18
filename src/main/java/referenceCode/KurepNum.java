package referenceCode;

public class KurepNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kaprekarNumbers(1, 1000);
	}

	public static void kaprekarNumbers(int p, int q) {
		// Write your code here

		for (int i = p; i <= q; i++) {

			if (i % 10 == 0) {
				continue;
			}
			//i=703;
			long sq =(long) i * i;

			long noDigit = digit(sq);

			long modVal = noDigit / 2;

			int dit = 1;
			if (i <= 100) {

				for (int j = 1; j <= modVal; j++) {
					dit *= 10;
				}
			}

			if (i > 100) {
				for (int j = 0; j <= modVal; j++) {
					dit *= 10;
				}
			}
			long fVal = sq % dit;

			long sval = sq / dit;

			long sum = fVal + sval;

			if (sum == i) {
				System.out.print(i);
				System.out.print(" ");
			}
			

		}
	}

	public static long digit(long sq) {
		// int temp=n%10;
		long count = 0;
		while (sq > 0) {
			sq = sq / 10;
			count++;
		}

		return count;
	}

}
