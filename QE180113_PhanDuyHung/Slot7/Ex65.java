/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot7;
import java.util.Scanner;
/**
 *
 * @author HUNG
 */
class Node {
    int data;
    Node left;
    Node right;
}
public class Ex65 {
    static Node insert(Node t, int x) {
        if (t == null) {
            Node temp = new Node();
            temp.data = x;
            temp.left = null;
            temp.right = null;
            return temp;
        } else {
            if (x < t.data) {
                t.left = insert(t.left, x);
            } else {
                t.right = insert(t.right, x);
            }
        }
        return t;
    }

    static int treeLevel(Node t) {
        if (t == null) return -1;
        return 1 + Math.max(treeLevel(t.left), treeLevel(t.right));
    }

    static boolean checkAVL(Node t) {
        if (t == null) return true;
        if (Math.abs(treeLevel(t.left) - treeLevel(t.right)) > 1) return false;
        return checkAVL(t.left) && checkAVL(t.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node t = null;
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            t = insert(t, temp);
        }
        System.out.println(checkAVL(t));
    }
}

