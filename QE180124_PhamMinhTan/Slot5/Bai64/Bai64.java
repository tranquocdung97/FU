package Bai64;

import java.util.Scanner;

public class Bai64 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        binaryTree.inputNode(n, sc);
        System.out.println(binaryTree.findTreeLevel(binaryTree.getRoot()));
    }
}
