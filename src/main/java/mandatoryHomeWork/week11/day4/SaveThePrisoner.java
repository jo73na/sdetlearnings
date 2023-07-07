package mandatoryHomeWork.week11.day4;

public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4,m=6, s=2;
saveThePrisoner(n, m, s);
	}

	public static int saveThePrisoner(int n, int m, int s) {
		// Write your code here

		int r = m % n;
		int ans = (r + s - 1) % n;

		if (ans == 0) {

			return n;

		} else {
			return ans;
		}

	}

}
