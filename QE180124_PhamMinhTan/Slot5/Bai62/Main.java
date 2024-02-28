package Slot5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        tree.inputElement(sc, n);
        tree.printTree(tree.getRoot());
        sc.close();
    }
}
