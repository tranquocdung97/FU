/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b62;

/**
 *
 * @author PHUC
 */
import java.util.Scanner;
public class B62 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BinaryTree tree = new BinaryTree();
    for (int i = 0; i < n; i++) {
      tree.add(sc.nextInt());
    }
    tree.displayNodeList(tree.root);
  }
  static class BinaryTree {
    Node root;
    class Node {
      private int val;
      Node next, prev;
      Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
      }
    }
    BinaryTree() {
      this.root = null;
    }
    void add(int val) {
      root = addNodeRecusive(root, val);
    }
    private Node addNodeRecusive(Node current, int val) {
      if (current == null) {
        return new Node(val);
      }
      if (val <= current.val) {
        current.prev = addNodeRecusive(current.prev, val);
      } else {
        current.next = addNodeRecusive(current.next, val);
      }
      return current;
    }
    void displayNodeList(Node current) {
      if (current != null) {
        displayNodeList(current.prev);
        System.out.print(current.val + " ");
        displayNodeList(current.next);
      }
    }
  }
}