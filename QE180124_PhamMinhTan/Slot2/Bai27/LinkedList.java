package Bai27;

class LinkedList {
    Node head;

    public void showList(int n) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void createNodeFromNToOne(int n) {
        Node current = null;
        for (int i = n; i >= 1; i--) {
            Node newNode = new Node(i);
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }
    }

    public void createNodeFromOneToN(int n) {
        Node current = head;
        while (current.next.data != 1) {
            current = current.next;
        }
        for (int i = 1; i <= n; i++) {
            Node newNode = new Node(i);
            if (head == null) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }
    }
}
