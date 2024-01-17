package Bai22;

import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            linkedList.Add(data);
        }
        int k = sc.nextInt();
        sc.nextLine();
        int userRequestData = sc.nextInt();
        sc.nextLine();
        linkedList.AddUserRequestNode(k,n, userRequestData);
        linkedList.ShowList();
        sc.close();
    }
}
