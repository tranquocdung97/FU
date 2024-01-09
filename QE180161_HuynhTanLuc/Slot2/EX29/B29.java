/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b29;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
    }   
}

class DoublyLinkedList {
    Node head;
    Node tail;
    
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public void removeAtIndex(int index) {
        if (head == null || index < 0){
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }
        
        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            count++;
            current = current.next;
        }
        
        if (current == null) 
            return;
        
        if (current.next!= null)
            current.next.prev = current.prev;
        
        if (current.prev != null)
            current.prev.next =current.next;
        else
            head = current.next;
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class B29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            doublyLinkedList.addToEnd(number);
        }

        int k = scanner.nextInt();

        doublyLinkedList.removeAtIndex(k);
        doublyLinkedList.printList();
    }
    
}
