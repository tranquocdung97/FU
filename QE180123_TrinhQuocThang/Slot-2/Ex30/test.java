import java.util.Scanner;

public class test {
	public static class Node {

		public int value;
		public Node next;

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
	public static class CircleLinkedList {
		private Node head, tail;

		public CircleLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void printList(int index) {
			if (head != null) {
				int i = 0;
				while (i < index) {
					head = head.next;
					i++;
				}
				Node curNode = head;
				while (curNode.next != head) {
					System.out.print(curNode.value + " ");
					curNode = curNode.next;
				}
				System.out.print(curNode.value);
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
				head = newNode;
			}
		}

		public void addTail(int value) {
			Node newNode = new Node(value);
			if (head == null) {
				head = tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
				tail.next = head;
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		CircleLinkedList list = new CircleLinkedList();
		for (int i = 0; i < n; i++)
			list.addTail(scanner.nextInt());
		int index = scanner.nextInt();
		list.printList(index);
		scanner.close();
	}
}
