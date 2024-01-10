package Bai24;

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

    public void ShowUserRequestData(int k, int n) {
     Node current = head;
        if (k == 0) {
            System.out.println(current.data);
        } else if (k == n - 1) {
            ShowLastNode();
        } else {
            ShowNodeMiddleCase(k);
        }
    }

    private void ShowNodeMiddleCase(int k) {
        Node current = head;
        for (int i = 0; i < k; i++) {
            current = current.next;
        }
        System.out.println(current.data);
    }

    private void ShowLastNode() {
     Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println(current.data);
    }
}
