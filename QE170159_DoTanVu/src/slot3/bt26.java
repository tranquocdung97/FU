
package slot3;

import java.util.Scanner;

// Dinh nghia cau truc cua mot nut trong danh sach lien ket don
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class bt26
{
    // Ham de them mot phan tu vao cuoi danh sach lien ket don
    public static ListNode append(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // Ham de xoa nhung phan tu co gia tri lon hon gia tri cua phan tu o chi so k
    public static ListNode deleteGreaterElements(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        ListNode prev = null;
        int index = 0;
        int valueAtIndexK = 0;

        // Tim gia tri cua phan tu o chi so k
        while (current != null) {
            if (index == k) {
                valueAtIndexK = current.val;
                break;
            }
            index++;
            current = current.next;
        }

        current = head;
        prev = null;

        // Xoa nhung phan tu co gia tri lon hon gia tri cua phan tu o chi so k
        while (current != null) {
            if (current.val > valueAtIndexK) {
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

        return head;
    }

    // Ham de in ra danh sach lien ket don
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ListNode head = null;

        // Nhap day so va them vao danh sach lien ket don
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            head = append(head, val);
        }

        // Nhap chi so k
        int k = scanner.nextInt();

        // Xoa nhung phan tu co gia tri lon hon gia tri cua phan tu o chi so k
        head = deleteGreaterElements(head, k);

        // In ra danh sach lien ket don da thay doi
        printList(head);
    }
}
