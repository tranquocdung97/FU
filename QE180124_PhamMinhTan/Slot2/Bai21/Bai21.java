package Bai21;

import java.util.Scanner;
public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            int data = sc.nextInt();
            linkedList.add(data);
        }
        linkedList.showList();
    }
}
