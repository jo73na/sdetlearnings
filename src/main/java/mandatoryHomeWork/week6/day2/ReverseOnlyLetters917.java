package mandatoryHomeWork.week6.day2;

public class ReverseOnlyLetters917 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a-bC-dEf-ghIj";
		String s1 = "Test1ng-Leet=code-Q!";
		System.out.println(s1);
		String reverseOnlyLetters = reverseOnlyLetters(s1);
	}

	public static String reverseOnlyLetters(String s) {
		if (s.length() <= 1) {
			return s;
		}
		char[] arr = s.toCharArray();
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			boolean lChar = ((arr[l] >= 'a' && arr[l] <= 'z') || (arr[l] >= 'A' && arr[l] <= 'Z')) ? true : false;
			boolean rChar = ((arr[r] >= 'a' && arr[r] <= 'z') || (arr[r] >= 'A' && arr[r] <= 'Z')) ? true : false;
			if (!lChar) {
				l++;
			} else if (!rChar) {
				r--;
			} else {
				// System.out.println(arr[l]+"|"+arr[r]);
				swap(arr, l, r);
				l++;
				r--;
			}
		}
		String string = new String(arr);
		System.out.println(string);
		return string;

	}

	private static void swap(char[] arr, int c, int d) {
		char t = arr[c];
		arr[c] = arr[d];
		arr[d] = t;

	}

}
