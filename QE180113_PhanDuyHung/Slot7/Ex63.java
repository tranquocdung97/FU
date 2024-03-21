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
public class Ex63 {
    public static Node insert(Node t, int x) {
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
    public static boolean isLeafNode(Node l) {
        return (l.left == null && l.right == null);
    }
    public static int countLeafNode(Node t) {
        if (t == null) return 0;
        if (isLeafNode(t)) return 1;
        return countLeafNode(t.left) + countLeafNode(t.right);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node t = null;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            t = insert(t, x);
        }
        System.out.println(countLeafNode(t));
    }
}