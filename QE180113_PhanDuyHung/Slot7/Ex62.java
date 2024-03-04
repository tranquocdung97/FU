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

class Ex62 {
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
            return t;
        }
    }
    
    static void printTree(Node t) {
        if (t != null) {
            printTree(t.left);
            System.out.print(t.data + " ");
            printTree(t.right);
        }
    } 
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        Node t = null;
        for (int i = 0; i < n; i++) {
            int x = ip.nextInt();
            t = insert(t, x);
        }
        printTree(t);
    }
}

