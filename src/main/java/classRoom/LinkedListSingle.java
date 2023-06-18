package classRoom;

public class LinkedListSingle {
	public static void main(String[] args) {

		LinkedListSingle ll = new LinkedListSingle();
		ll.add("1");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		ll.add("6");
		ll.display();
		ll.insert(3, "100");
		ll.display();
		ll.delete("100");
		ll.display();

	}

	class Node {
		String data = null;
		Node next = null;

		public Node() {

		}

		public Node(String data) {
			this.data = data;
		}

		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	Node start = null;
	int size = 0;

	// add value at the end
	void add(String data) {
		Node node = new Node(data);
		if (start == null) {
			start = node;
		} else {
			Node current = start;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			size++;
		}
	}

	void insert(int pos, String data) {
		int index = pos;
		Node node = new Node();
		node.data = data;
		int count = 1;
		Node current = start;
		if (index == 1) {
			node.next = start;
			start = node;
			size++;
			return;
		}
		while (count < index--) {
			// System.out.println("inside while "+index);
			current = current.next;
			count++;
			// System.out.println("count:"+count);
		}
		node.next = current.next;
		current.next = node;
		size++;

	}

	void delete(String data) {
		if (start != null && start.data.equals(data)) {
			start = start.next;
			size--;
		}
		if (start == null || start.next == null) {
			return;
		}
		Node current = start.next;
		Node prev = start;
		while (current != null) {
			if (current.data.equals(data)) {
				prev.next = current.next;
				size--;
			}
			prev = current;
			current = current.next;
		}
	}

	// Display the linked list
	void display() {
		Node temp = new Node();
		temp = start;
		System.out.print("[ ");
		while (temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.print("Null ]");
		System.out.println("Size: "+(size+1));
	}

}