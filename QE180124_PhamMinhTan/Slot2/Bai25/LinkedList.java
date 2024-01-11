package Bai25;

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

    public void changeNodeData(int k, int valueToChange) {
        int count = countTotalNode() ;
        if (count == 0) {
            return;
        } else if (k < 0 || k > count) {
            return;
        }
        changeValue(valueToChange, k);
    }

    private void changeValue(int valueToChange, int k) {
        Node current = head;
        while (current != null) {
            if (current.data == k) {
                current.data = valueToChange;
            }
            current = current.next;
        }
    }

    private int countTotalNode() {
        int count = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }
}
