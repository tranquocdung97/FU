import java.util.Scanner;

public class MyLinkedList {
    public static DouList createList(int x){
        DouList temp = new DouList();
        temp.head = new Node();
        temp.head.value = x;
        temp.head.next = null;
        temp.head.pre = null;
        temp.tail = temp.head;
        return temp;
    }

    public static DouList addHead(DouList headNode, int x){
        Node temp = new Node();
        temp.value = x;
        temp.pre = null;
        temp.next = headNode.head;
        headNode.head.pre = temp;
        headNode.head = temp;
        return headNode;
    }

    public static DouList addTail(DouList tailNode, int x){
        Node temp = new Node();
        temp.value = x;
        temp.next = null;
        temp.pre = tailNode.tail;
        tailNode.tail.next = temp;
        tailNode.tail = temp;
        return tailNode;
    }

    public static DouList addAt(DouList node, int k, int x){
        Node p = node.head;
        for (int i=0; i<k-1; i++){
            p = p.next;
        }
        Node temp = new Node();
        temp.value = x;
        temp.pre = p;
        temp.next = p.next;
        p.next.pre = temp;
        p.next = temp;
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
        int a = sc.nextInt();
        if(k==0){
            l = addHead(l, a);
        } else if (k>0 && k<n-1) {
            l = addAt(l, k, a);
        } else {
            l = addTail(l, a);
        }
        printList(l);
    }
}