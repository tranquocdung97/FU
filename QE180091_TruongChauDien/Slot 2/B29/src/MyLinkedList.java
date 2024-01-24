import java.util.Scanner;

public class MyLinkedList {
    public static DouList createList(int x){
        DouList temp = new DouList();
        temp.head = new Node();
        temp.head.value = x;
        temp.head.pre = null;
        temp.head.next = null;
        temp.tail = temp.head;
        return temp;
    }

    public static DouList addTail(DouList node, int x){
        Node temp = new Node();
        temp.value = x;
        node.tail.next = temp;
        temp.pre = node.tail;
        temp.next = null;
        node.tail = temp;
        return node;
    }

    public static DouList deleteHead(DouList node){
        Node p = node.head.next;
        Node temp = node.head;
        p.pre = null;
        node.head = p;
        temp = null;
        return node;
    }

    public static DouList deleteTail(DouList node){
        Node p = node.tail.pre;
        Node temp = node.tail;
        p.next = null;
        node.tail = p;
        temp = null;
        return node;
    }

    public static DouList deleteAt(DouList node, int k){
        Node p = node.head;
        for (int i=0; i<k-1; i++){
            p = p.next;
        }
        Node temp = p.next;
        Node p1 = temp.next;
        p.next = p1;
        p1.pre = p;
        temp = null;
        return node;
    }

    public static void printList(DouList node){
        Node p = node.head;
        while (p!=null){
            System.out.print(p.value+" ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        DouList l = createList(x);
        for (int i=1; i<n; i++){
            x = sc.nextInt();
            l = addTail(l, x);
        }
        int k = sc.nextInt();
        if (k==0){
            l = deleteHead(l);
        } else if (k == n-1) {
            l = deleteTail(l);
        } else {
            l = deleteAt(l, k);
        }
        printList(l);
    }
}
