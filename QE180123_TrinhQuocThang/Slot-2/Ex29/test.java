import java.util.Scanner;

public class test {
	public static class Node {

		public int value;
		public Node prev;
		public Node next;

		public Node(int value) {
			this.value = value;
			this.prev = null;
			this.next = null;
		}

		public Node(int value, Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}

	}

	///////////
	public static class DoublyLinkedList {
		private Node head, tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void printList() {
			Node curNode = head;
			while (curNode != null) {
				System.out.print(curNode.value + " ");
				curNode = curNode.next;
			}
		}

		public int size() {
			if (head != null) {
				Node curNode = head;
				int i = 0;
				while (curNode != null) {
					curNode = curNode.next;
					i++;
				}
				return i;
			} else
				return 0;
		}

		public void addHead(int value) {
			Node newNode = new Node(value);
			if (head == null) {
				head = tail = newNode;
			} else {
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
			}
		}

		public void addTail(int value) {
			Node newNode = new Node(value);
			if (head == null) {
				head = tail = newNode;
			} else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
			}
		}

		public void insert(int index, int value) {
			if (head != null) {
				if (index == 0) {
					addHead(value);
					return;
				}
				Node curNode = head;
				int i = 1;
				while (i < index) {
					curNode = curNode.next;
					i++;
				}
				Node newNode = new Node(value);
				newNode.next = curNode.next;
				curNode.next = newNode;
			}
		}

		public void remove(int index) {
			if (head != null) {
				if (index == 0) {
					head=head.next;
					head.prev=null;
					return;
				}
				Node curNode = head;
				int i = 1;
				while (i < index) {
					curNode = curNode.next;
					i++;
				}
				curNode.next = curNode.next.next;
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		DoublyLinkedList list = new DoublyLinkedList();
		for (int i = 0; i < n; i++)
			list.addTail(scanner.nextInt());
		int index = scanner.nextInt();
		if (index >= 0 && index < n)
			list.remove(index);
		list.printList();
		scanner.close();
	}
}
