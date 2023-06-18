package referenceCode;

public class Node {
	int data;
	Node next = null;

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node() {
		super();
	}

}
