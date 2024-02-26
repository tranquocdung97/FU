
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

public class bt25 {
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

    // Ham de thay doi gia tri cua nhung phan tu co gia tri a thanh gia tri b
    public static void changeValue(ListNode head, int a, int b) {
        ListNode current = head;
        while (current != null) {
            if (current.val == a) {
                current.val = b;
            }
            current = current.next;
        }
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

        // Nhap gia tri a va b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Thay doi gia tri cua nhung phan tu co gia tri a thanh gia tri b
        changeValue(head, a, b);

        // In ra danh sach lien ket don da thay doi
        printList(head);
    }
}