package src;

import java.util.Scanner;

public class LinkedList {

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

    public static Node convertNode (Node head, int nodeValue, int convetValue){
        Node currentNode = head;
        while (currentNode != null){
            if (currentNode.value == nodeValue){
                currentNode.value = convetValue;
            }
            currentNode = currentNode.next;
        }
        return head;
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


        // convert
        System.out.print("\nEnter node to convert: ");
        int x = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        int y = scanner.nextInt();

        convertNode(head, x, y);
        System.out.print("Link list after converting: ");
        printList(head);
    }
}
