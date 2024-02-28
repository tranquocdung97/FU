package Bai63;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(binaryTree.inputElementAndFindLeaves(n, sc));
    }
}
