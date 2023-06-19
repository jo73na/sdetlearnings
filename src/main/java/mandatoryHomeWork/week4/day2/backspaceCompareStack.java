package mandatoryHomeWork.week4.day2;

import java.util.Stack;

public class backspaceCompareStack {

	public static void main(String[] args) {
		boolean backspaceCompare = backspaceCompare("ac#d", "ad#c");
		System.out.println("-------------------");
	//	boolean backspaceCompare = backspaceCompare("abcd", "bbcd");
		System.out.println(backspaceCompare);
		System.out.println("-------------------");
		// backspaceCompare("a##c", "#a#c");

	}

	public static boolean backspaceCompare(String s, String t) {

		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (st1.isEmpty() != true) {
					System.out.println("Pop: " + st1.peek());
					st1.pop();
				}
			} else {

				System.out.println("Push: " + s.charAt(i));
				st1.push(s.charAt(i));
			}
		}
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == '#') {
				if (st2.isEmpty() != true) {
					System.out.println("2Pop: " + st2.peek());
					st2.pop();
				}
			} else {

				System.out.println("2Push: " + t.charAt(i));
				st2.push(t.charAt(i));
			}
		}
		System.out.println("st1" + st1.toString());
		System.out.println("st2" + st2.toString());
		System.out.println("st1==st2: " + st1.equals(st2));
	System.out.println(	st1.size() +"=="+st2.size());
		if (st1.size() == st2.size()) {
			for (int i = 0; i < st1.size()+3; i++) {
				Character pop1 = st1.pop();
				Character pop2 = st2.pop();
				if (pop1 == pop2) {
					System.out.println(pop1 + "=" + pop2);
					
				} else {
					
					return false;
				}
			}
		} else {
			return false;
		}
		return true;

	}

}
