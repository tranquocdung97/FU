import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
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

    public int getValueAtIndex(int index) {
        int currentIndex = 0;
        Node current = head;
        while (current != null) {
            if (currentIndex == index) {
                return current.data;
            }
            current = current.next;
            currentIndex++;
        }
        return -1; 
    }
}

public class EX_24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        LinkedList linkedList = new LinkedList();
        int n = scanner.nextInt();
        
        System.out.println("Nhap vao cac so nguyen cua day so:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            linkedList.insert(num);
        }
        System.out.print("Nhap vao so nguyen k: ");
        int k = scanner.nextInt();
        int value = linkedList.getValueAtIndex(k);
        if (value == -1) {
            System.out.println("Chi so khong hop le.");
        } else {
            System.out.println("Gia tri o phan tu cuoi: " + value);
        }
    }
}