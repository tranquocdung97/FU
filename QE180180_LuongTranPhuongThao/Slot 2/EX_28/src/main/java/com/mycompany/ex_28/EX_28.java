/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_28;
import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("Khong hop le.");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            if (head != null) {
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else if (index == size()) {
            tail.next = newNode;
            tail = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;
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

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class EX_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n: ");
        int n = sc.nextInt();
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("Nhap vao cac so nguyen:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            dll.insert(i, num);
        }
        System.out.print("Nhap vao so nguyen k: ");
        int k = sc.nextInt();
        System.out.print("Nhap vao gia tri x: ");
        int x = sc.nextInt();
        dll.insert(k, x);
        System.out.println("List:");
        dll.printList();
    }
}