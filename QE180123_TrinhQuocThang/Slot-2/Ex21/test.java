import java.util.Scanner;

public class test {
	public static class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

	///////////
	public static class LinkedList {
		private Node head;

		public LinkedList() {
			this.head = null;
		}

		public void printList() {
			Node curNode = head;
			while (curNode != null) {
				System.out.print(curNode.value + " ");
				curNode = curNode.next;
			}
		}

		public void addElement(int x) {
			if (head == null)
				head = new Node(x);
			else {
				Node curNode = head;
				while (curNode.next != null)
					curNode = curNode.next;
				curNode.next = new Node(x);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; i++) {
			list.addElement(scanner.nextInt());
		}
		list.printList();
		scanner.close();
	}
}
