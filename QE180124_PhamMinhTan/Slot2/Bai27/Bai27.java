package Bai27;

import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        int n = sc.nextInt();
        sc.nextLine();
        linkedList.createNodeFromNToOne(n);
        linkedList.createNodeFromOneToN(n);
        linkedList.showList(n);
    }
}
