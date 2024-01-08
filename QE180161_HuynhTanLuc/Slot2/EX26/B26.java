
package b26;

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
    
    public void removeBigger(int k) {
        if (head == null)
            return;
        Node current = head;        
        
        for (int i = 0; i < k && current != null; i++) {
            current = current.next;           
        }
        if (current == null)
            return;
        int value = current.data;
        
        current = head;
        Node prev = null;
        current = head;
        while (current != null) {
            if (current.data > value) {
                if (prev == null)
                    head = current.next;
                else
                    prev.next = current.next;
            } else
                prev = current;
            current = current.next;
            }     
            
        }
    }

public class B26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            linkedList.addNode(number);
        }
        
        int k = sc.nextInt();        
        linkedList.removeBigger(k);
        linkedList.printLinkedList();
    }
    
}
