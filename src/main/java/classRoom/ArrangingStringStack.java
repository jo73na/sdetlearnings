package classRoom;

import java.util.Stack;

public class ArrangingStringStack {

	public static void main(String[] args) {
		String str = "3[a2[bc]]";
		adding(str);
	}

	public static void adding(String str) {

		Stack<Character> stack = new Stack<>();
		String sb = new String();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ']') {
				System.out.println("------pop------");
				Character pop = stack.pop();
				System.out.println(pop);
				sb = pop + sb;
				System.out.println(sb);
			}
			if (str.charAt(i) != ']') {
				System.out.println(str.charAt(i));
				stack.push(str.charAt(i));
			}
		
				stack.pop();
				int count = stack.pop()-'0';
				System.out.println("====count=====");
				System.out.println(count);
				String rep="";
				for (int j = 1; j <=count; j++) {
					rep+=sb;
				}
				for (int k = 0; k<rep.length(); k++) {
					stack.push(rep.charAt(k));
				}
			
		}
		System.out.println("*******");
		System.out.println(stack.toString());

	}

}
