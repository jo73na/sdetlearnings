package classRoom;

import java.util.Stack;

public class BracketStackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{{{";
		String s1 = "";
		String s2 = "{[}";
		String s3 = "[[{}}})]";
		boolean valid = isValid(s);

		System.out.println(valid);
	}

	public static boolean isValid(String c) {

		boolean res = false;
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) == '(' || c.charAt(i) == '{' || c.charAt(i) == '[') {
				st.push((c.charAt(i)));
			}

			if (st.size() > 0) {
				Character pop = st.pop();
				if (c.charAt(i) == ')' && pop == '(' || c.charAt(i) == '}' && pop == '{'
						|| c.charAt(i) == ']' && pop == '[') {

					return true;
				}
			} else {
				return res;
			}

		}
		return res;

	}

}
