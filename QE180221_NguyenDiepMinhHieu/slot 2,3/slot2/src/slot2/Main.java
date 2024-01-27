package slot2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            int data = scanner.nextInt();
            linkedList.addNode(data);
        }

        System.out.print("Nhập số nguyên k (0 ≤ k < n): ");
        int k = scanner.nextInt();

        linkedList.deleteNodeAtIndex(k);

        System.out.println("Danh sách sau khi xóa phần tử tại chỉ số " + k + ": ");
        linkedList.printList();
    }
}
