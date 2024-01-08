
package b25;

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
    
    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
            
    }
    
    public void convert(int a, int b) {
        Node current = head;
        while (current != null) {
            if (current.data == a){
                current.data = b;
            }
            current = current.next;
        }
    }
}

public class B25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            linkedList.addNode(number);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        linkedList.convert(a, b);
        linkedList.printLinkedList();
    }
    
}
