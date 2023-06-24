package meetproblems;

import java.util.Arrays;
import java.util.Stack;

public class BackspaceCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "ad#c";
backspaceCompareWithoutStack(s, s);

	}

	public boolean backspaceCompare(String s, String t) {
		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (st1.isEmpty() != true)
					st1.pop();
			} else {
				st1.push(s.charAt(i));
			}
			if (t.charAt(i) == '#') {
				if (st2.isEmpty() != true)
					st2.pop();
			} else {
				st1.push(s.charAt(i));
			}

		}

		return st1.equals(st2);

	}

	public static void backspaceCompareWithoutStack(String s, String t) {
		//"ab#c";
int start = 0;
int fast = 1;
int end = s.length();
 char[] arr = s.toCharArray();
while (start < end && fast < end) {
	//annd
	//     s
	while ( arr[fast]=='#') {
		
		arr[start] = '\0';
		arr[fast] = '\0';
		//
		while (start > 0 && arr[start] == '\0') {
			start--;
		}
		if (fast < end - 1) {
			fast++;
		}
	}
	start = fast;
	fast++;
}
System.out.println(Arrays.toString(arr));
System.out.println(arr.equals(arr));
}
}
