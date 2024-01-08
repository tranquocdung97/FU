import java.awt.HeadlessException;
import java.util.Scanner;

import javax.crypto.SealedObject;
import javax.sound.midi.Soundbank;

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

		public Node remove(int index) {
			if (head != null) {
				if (index == 0) {
					Node removeNode = head;
					head = head.next;
					return removeNode;
				}
				Node curNode = head;
				int i = 1;
				while (i < index) {
					curNode = curNode.next;
					i++;
				}
				Node removeNode = curNode.next;
				curNode.next = curNode.next.next;
				return removeNode;
			} else
				return null;
		}

		public int search(int index) {
			if (head != null) {
				int i = 0;
				Node curNode = head;
				while (i < index) {
					curNode = curNode.next;
					i++;
				}
				return curNode.value;
			} else
				return -1;
		}

		public void renovate(int value, int newValue) {
			if (head != null) {
				Node curNode = head;
				while (curNode != null) {
					if (curNode.value == value)
						curNode.value = newValue;
					curNode = curNode.next;
				}
				printList();
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
		int val = scanner.nextInt();
		int newVal =scanner.nextInt();
		list.renovate(val, newVal);
		scanner.close();
	}
}
