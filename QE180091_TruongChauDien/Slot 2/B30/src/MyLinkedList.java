import java.util.Scanner;

public class MyLinkedList {
    public static Node createList(int x){
        Node temp = new Node();
        temp.value = x;
        temp.next = temp;
        return temp;
    }
    public static Node addTail(Node l, int x){
        Node p = l;
        while (p.next!=l){
            p = p.next;
        }
        Node temp = new Node();
        temp.value = x;
        temp.next = l;
        p.next = temp;
        return l;
    }

    public static void printList(Node l, int k){
        Node p = l;
        for (int i=0; i<k; i++){
            p = p.next;
        }
        System.out.print(p.value+" ");
        Node p1 = p.next;
        while (p1!=p){
            System.out.print(p1.value+" ");
            p1 = p1.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x = sc.nextInt();
        Node l = createList(x);
        Node p =l;
        for (int i=1; i<n; i++){
            x = sc.nextInt();
            l = addTail(l, x);
        }
        int k = sc.nextInt();
        printList(l, k);
    }
}
