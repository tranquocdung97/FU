package src;

import java.util.Scanner;

public class LInkedList {

    public static Node createNode (int value){
        return new Node (value);
    }

    public static Node addElement (Node head, int value){
        Node newNode = createNode(value);
        head.next = newNode;
        return newNode;
    }

    public static void printList (Node head){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }

    public static void getNodeValue(Node head, int k) {
        Node currentNode = head;
        int i = 0;
        while (currentNode != null) {
            if (i == k) {
                System.out.println(currentNode.value);
                break;
            }
            i++;
            currentNode = currentNode.next;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int value = scanner.nextInt();

        Node head = createNode(value);
        Node tail = head;

        for (int i = 1; i < n; i++){
            value = scanner.nextInt();
            tail = addElement(tail,value);
        }
        printList(head);
        System.out.print("\nEnter k index to get node value: ");
        int k = scanner.nextInt();
        getNodeValue(head, k);
    }
}
