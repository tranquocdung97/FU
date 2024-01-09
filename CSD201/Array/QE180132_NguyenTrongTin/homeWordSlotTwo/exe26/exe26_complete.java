import java.util.Scanner;

public class exe26_complete {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node getNodeAtIndex(Node headNode, int k) {
        int count = 0;
        Node curNode = headNode;
        while (curNode != null && count < k) {
            curNode = curNode.next;
            count++;
        }
        return curNode;
    }

    public static Node removeGreaterNodes(Node headNode, Node targetNode) {
        Node head = headNode;  // Con trỏ head để duyệt danh sách
        Node prevNode = null;  // Con trỏ prevNode để lưu giữ nút trước nút hiện tại

        // Duyệt qua danh sách và loại bỏ các nút có giá trị lớn hơn hoặc bằng giá trị của nút targetNode
        while (head != null) {
            if (head.val > targetNode.val) {
                if (prevNode == null) {
                    headNode = head.next;
                } else {
                    prevNode.next = head.next;
                }
            } else {
                prevNode = head;
            }

            head = head.next;
        }

        return headNode;  // Trả về danh sách mới sau khi loại bỏ các nút có giá trị lớn hơn hoặc bằng giá trị của nút targetNode
    }

    public static void Print(Node headNode) {
        Node curNode = headNode;
        while (curNode != null) {
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
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
        return headNode;
    }
//
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
//        int k = input.nextInt();  // Chỉ số k
//        Node targetNode = getNodeAtIndex(head, k);
//
//        if (targetNode != null) {
//            head = removeGreaterNodes(head, targetNode);
//        }
//
//        Print(head);
//    }
}
