
    import java.util.Scanner;

public class exe30_complete {
    public static class Node {
        int val;
        Node next;
        Node pre;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.pre = null;
        }
    }

    public static Node addToTail(Node headNode, int val) {
        Node newNode = new Node(val);
        if (headNode == null) {
            return newNode;
        } else {
            Node checkNode = headNode;
            while (checkNode.next != null) {
                checkNode = checkNode.next;
            }
            checkNode.next = newNode;
            newNode.pre = checkNode;
        }
        return headNode;
    }

    public static Node convertToCircularLinkedList(Node headNode) {
        if (headNode == null) {
            return null;
        }

        Node current = headNode;
        while (current.next != null) {
            current = current.next;
        }

        current.next = headNode;
        headNode.pre = current;

        return headNode;
    }

    public static void printCircularList(Node headNode, int vv) {
        Node newOneHead = headNode;
        for (int i = 0; i < vv; i++) {
            newOneHead = newOneHead.next;
        }
        System.out.print(newOneHead.val + " ");

        Node current = newOneHead.next;
        while (current != newOneHead) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int v = input.nextInt();
            head = addToTail(head, v);
        }
        
        // Chuyển đổi danh sách thành danh sách liên kết vòng
        head = convertToCircularLinkedList(head);

        int vv = input.nextInt();
        printCircularList(head, vv);
    }
}

