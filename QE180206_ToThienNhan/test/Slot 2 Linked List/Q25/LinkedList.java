
package src;
import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int x) {
        data = x;
        next = null;
    }
}
public class LinkedList {

    static ListNode createNode(int x) {
        return new ListNode(x);
    }

    static void printList(ListNode l) {
        ListNode p = l;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    static ListNode addElement(ListNode p, int x) {
        ListNode temp = createNode(x);
        p.next = temp;
        return temp;
    }

    static ListNode convert(ListNode l, int a, int b) {
        ListNode p = l;
        while (p != null) {
            if (p.data == a) {
                p.data = b;
            }
            p = p.next;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        ListNode l = createNode(x);
        ListNode p = l;

        for (int i = 1; i < n; i++) {
            x = scanner.nextInt();
            p = addElement(p, x);
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        l = convert(l, a, b);
        printList(l);


        scanner.close();
    }
}
