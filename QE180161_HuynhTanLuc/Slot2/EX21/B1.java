package b1;

import java.util.Scanner;

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    class LinkedList {
        Node head;
        
        public void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) 
                head = newNode;
            else {
                Node current = head;
                while (current.next != null)
                    current = current.next;
                current.next = newNode;
            }
        }
        
      
        public void printLinkedList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;

            }
        }
    }

    
class B1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList linkedlist = new LinkedList();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            linkedlist.addNode(number);
        }    
        linkedlist.printLinkedList();
    }
}
