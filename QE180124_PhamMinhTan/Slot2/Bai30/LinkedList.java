package Bai30;

class LinkedList {
    Node head;
    Node initialHead;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void showCircularLinkedList() {
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }

    public void circularLinkedList(int k) {
        if (k == 0) {
        } else {
            kToLastNode(k);
            initialHead = head;
            lastNodeToInitialHeadNode();
        }
    }


    private void lastNodeToInitialHeadNode() {
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = initialHead;
    }

    private void kToLastNode(int k) {
        Node current = head;
        for (int i = 0; i < k; i++) {
            current = current.next;
        }
        initialHead = current.next;
        head = current;
    }
}
