import java.util.Scanner;

public class Check {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node addToTail(Node headNode, int val) {
        Node newNode = new Node(val);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode; // Trả về headNode đã được cập nhật
    }

    public static void printList(Node headNode) {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        Node head = null;
//
//        for (int i = 0; i < n; i++) {
//            int v = input.nextInt();
//            head = addToTail(head, v);
//        }
//
//        printList(head);
//    }
}
