package slot2;


	import java.util.Scanner;

	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    public LinkedList() {
	        this.head = null;
	    }

	    
	    public void addNode(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	   
	    public void deleteNodeAtIndex(int k) {
	        if (k < 0 || k >= size()) {
	            System.out.println("Chỉ số không hợp lệ");
	            return;
	        }

	        if (k == 0) {
	            head = head.next;
	        } else {
	            Node current = head;
	            for (int i = 0; i < k - 1; i++) {
	                current = current.next;
	            }
	            current.next = current.next.next;
	        }
	    }

	  
	    public void printList() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	    }

	  
	    public int size() {
	        int count = 0;
	        Node current = head;
	        while (current != null) {
	            count++;
	            current = current.next;
	        }
	        return count;
	    }
	}

	

