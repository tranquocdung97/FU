package src;

import java.util.Scanner;

public class LinkedList{
    public static Node createNode(int value){
        return new Node(value);
    }

    public static void printList(Node l){
        Node p = l;
        while (p != null){
            System.out.print(p.value + " ");
            p = p.next;
        }
    }

    public static Node addElement(Node l, int value){
        Node temp = createNode(value);
        l.next = temp;
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
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