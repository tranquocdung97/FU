package Bai25;

import java.util.Scanner;

public class Bai25 {
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
        int userRqData = sc.nextInt();
        sc.nextLine();
        linkedList.changeNodeData(k, userRqData);
        linkedList.showList();
    }
}
