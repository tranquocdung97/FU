package Bai23;

class LinkedList {
    Node head;
    public void Add (int data) {
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

    public void RemoveNode(int index, int n) {
        Node current = head;
        if (index == 0) {
            head = current.next;
        } else if (index == n - 1) {
            RemoveLastNode();
        } else {
            RemoveMiddleNode(index);
        }
    }

    private void RemoveMiddleNode(int index) {
        Node current = head;
        Node prev = null;
        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
    }

    private void RemoveLastNode() {
        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }
}
