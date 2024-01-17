package Bai29;

import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            linkedList.add(data);
        }
        int k = sc.nextInt();
        sc.nextLine();
        linkedList.removeNode(k,n);
        linkedList.showList();
        sc.close();
    }
}
