package Bai26;

class LinkedList {
    Node head;
    public void Add(int data) {
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
    public void ShowList () {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void RmData(int max,int n) {
        Node current = head;
        Node prev = null;
        int dataMax = findDataMax(max);
        while (current != null) {
            if (current.data > dataMax) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    private int findDataMax (int max) {
        Node current = head;
        for (int i = 0; i < max; i++) {
            current = current.next;
        }
        return current.data;
    }
}
