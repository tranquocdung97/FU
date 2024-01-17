package Bai29;

class LinkedList {
    Node head;
    public void add (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void showList () {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void removeNode(int k, int n) {
        if (k == 0) {
            removeFirstNode();
        } else if (k >= n - 1) {
            removeLastNode();
        } else {
            removeMiddleNode(k);
        }
    }

    private void removeMiddleNode(int k) {
        Node current = head;
        Node prev = null;
        for (int i = 0; i < k; i++) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
    }

    private void removeLastNode() {
        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }

    private void removeFirstNode() {
        Node current = head;
        head = current.next;
    }
}
