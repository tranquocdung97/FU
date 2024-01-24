package src;

import java.util.Scanner;

public class LinkedList {
    public static Node createNode(int value) {
        return new Node(value);
    }

    public static void printList(Node head) {
        Node curent = head;
        while (curent != null) {
            System.out.print(curent.value + " ");
            curent = curent.next;
        }
    }

    public static Node addElement(Node current, int value) {
        Node newNode = createNode(value);
        current.next = newNode;
        return newNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = scanner.nextInt();
        System.out.println("create first node:  ");
        int x = scanner.nextInt();

        Node l = createNode(x);
        Node p = l;

        for (int i = 1; i < n; i++) {
            x = scanner.nextInt();
            p = addElement(p, x);
        }

        printList(l);
        scanner.close();

    }
}