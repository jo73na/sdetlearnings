package classRoom;

public class StackExample {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push('A');
		st.push('B');
		st.push('C');
		st.push('D');
		String display = st.display();
		System.out.println(display);
		Character peak = st.peak();
		System.out.println(peak);
	}
}

class Stack {
	private int cap = 50;
	private Character[] st = new Character[cap];
	private int top = 0;

	public boolean push(char c) {
		if (top < cap) {
			st[top] = c;
			top++;
			return true;
		}
		return false;
	}

	public int find(Character c) {
		for (int i = 0; i < st.length; i++) {
			if (st[i] == c) {
				return i;
			}

		}
		return -1;
	}

	public Character pop() {
		if (top > 0) {
			Character temp = st[top - 1];
			top--;
			return temp;
		} else {
			return null;
		}

	}

	public Character peak() {
		if (top > 0) {
			return st[top - 1];
		}
		return null;
	}

	public int size() {
		return top;
	}

	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < top; i++) {
			sb.append(st[i] + ", ");
		}

		sb.append("}");

		return sb.toString();

	}
}
