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

		public void addLast(int x) {
			if (head == null)
				head = new Node(x);
			else {
				Node curNode = head;
				while (curNode.next != null)
					curNode = curNode.next;
				curNode.next = new Node(x);
			}
		}

		public void addIndex(int index, int x) {
			if (head == null)
				return;
			else {
				if (index == 0) {
					head = new Node(x, head);
					return;
				}
				Node curNode = head;
				int i = 0;
				while (i < index - 1) {
					curNode = curNode.next;
					i++;
				}
				curNode.next = new Node(x, curNode.next);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; i++) {
			list.addLast(scanner.nextInt());
		}
		int k = scanner.nextInt();
		int x = scanner.nextInt();
		if (k >= 0 && k <= n) {
			list.addIndex(k, x);
			list.printList();
		}
		scanner.close();
	}
}
