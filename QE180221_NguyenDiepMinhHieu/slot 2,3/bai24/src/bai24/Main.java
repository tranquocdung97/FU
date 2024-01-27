package bai24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        
        LinkedList linkedList = new LinkedList();
        System.out.println("Nhập n số nguyên của dãy số:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            linkedList.addNode(num);
        }

       
        System.out.print("Nhập số nguyên k (0 ≤ k < n): ");
        int k = scanner.nextInt();

      
        if (k >= 0 && k < n) {
            int elementAtIndexK = linkedList.getElementAtIndex(k);
            System.out.println("Giá trị tại chỉ số " + k + ": " + elementAtIndexK);
        } else {
            System.out.println("Chỉ số k không hợp lệ.");
        }
    }
}
