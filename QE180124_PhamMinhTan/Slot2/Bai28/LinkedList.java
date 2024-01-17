package Bai28;

class LinkedList {
    Node head;
    public void add(int data) {
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

    public void showList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void addNodeAtK(int k, int value, int n) {
        Node nodeToAdd = new Node(value);
        if (k == 0) {
            Node current = head;
            head = nodeToAdd;
            nodeToAdd.next = current;
        } else if (k > n - 1) {
            addLastOfNode(nodeToAdd);
        } else {
            addMiddleOfNode(k, nodeToAdd);
        }
    }

    private void addMiddleOfNode(int k, Node nodeToAdd) {
        Node current = head;
        Node prev = null;
        for (int i = 0; i < k; i++) {
            prev = current;
            current = current.next;
        }
        prev.next = nodeToAdd;
        nodeToAdd.next = current;
    }

    private void addLastOfNode(Node nodeToAdd) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = nodeToAdd;
    }
}
